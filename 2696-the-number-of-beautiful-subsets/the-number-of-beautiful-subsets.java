class Solution {
    public int beautifulSubsets(int[] nums, int k) {
        Arrays.sort(nums);
        List<List<Integer>>ll=new ArrayList<>();
        List<Integer>l=new ArrayList<>();
        f(0,l,ll,nums,k);
        return ll.size();
    }
    public void f(int i,List<Integer>l,List<List<Integer>>ll,int[]nums,int k){
        if(i==nums.length){
            if(l.size()>0){
                ll.add(l);
            }
            return;
        }
        if(!l.contains(nums[i]-k)){
            l.add(nums[i]);
            f(i+1,l,ll,nums,k);
            l.remove(l.size()-1);
        }
        f(i+1,l,ll,nums,k);
    }
}