class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>>ll=new ArrayList<>();
        List<Integer>l=new ArrayList<>();
        print(ll,l,nums);
       return ll;         
    }
    public void print(List<List<Integer>>ll,List<Integer>l,int[]nums){
        if(l.size()==nums.length){
            ll.add(new ArrayList<>(l));
            return;
        }
        for(int i=0;i<nums.length;i++){
           if(l.contains(nums[i])) continue;
            l.add(nums[i]);
            print(ll,l,nums);
            l.remove(l.size()-1);
        }
    }
}