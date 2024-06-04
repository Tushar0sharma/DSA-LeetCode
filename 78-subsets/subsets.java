class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>>ll=new ArrayList<>();
        List<Integer>l=new ArrayList<>();
        call(l,ll,0,nums);
        return ll;
    }
    public void call(List<Integer>l,List<List<Integer>>ll,int i,int []nums){
        if(i==nums.length){
            ll.add(new ArrayList<>(l));
            return;
        }
        call(l,ll,i+1,nums);
        l.add(nums[i]);
        call(l,ll,i+1,nums);
        l.remove(l.size()-1);
    }
}