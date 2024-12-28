class Solution {
    public double[] medianSlidingWindow(int[] nums, int k) {
        double[]ans=new double[nums.length-k+1];
        TreeSet<Integer>min=new TreeSet<>((a,b)->(nums[a]!=nums[b])?Integer.compare(nums[a],nums[b]):Integer.compare(a,b));
        TreeSet<Integer>max=new TreeSet<>((a,b)->(nums[a]!=nums[b])?Integer.compare(nums[b],nums[a]):Integer.compare(a,b));
        int i=0,j=0;
        while(j<nums.length){
            add(min,max,j);
            if(j-i==k){
                remove(min,max,i,nums);
                i++;
            }
            if(j-i+1==k){
                ans[i]=median(min,max,nums);
            }
            j++;
        }
        return ans;
    }
    public double median(TreeSet<Integer>min,TreeSet<Integer>max,int []nums){
        if(min.size()==max.size()) return ((double)nums[min.first()]+nums[max.first()])/2;
        return (nums[max.first()]);
    }
    public void remove(TreeSet<Integer>min,TreeSet<Integer>max,int i,int[]nums){
        if(min.contains(i)){
            min.remove(i);
            if(max.size()==min.size()+2){
                min.add(max.pollFirst());
            }
        }
        else{
            max.remove(i);
            if(min.size()>max.size()){
                max.add(min.pollFirst());
            }
        }
    }
    public void add(TreeSet<Integer>min,TreeSet<Integer>max,int i){
        max.add(i);
        min.add(max.pollFirst());
        if(min.size()>max.size()){
            max.add(min.pollFirst());
        }
    }
}