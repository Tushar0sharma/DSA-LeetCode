class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>>ll=new ArrayList<>();
        List<Integer>l=new ArrayList<>();
        call(nums,ll,l);
        return ll;
    }
    public void call(int[]nums,List<List<Integer>>ll,List<Integer>l){
        if(l.size()==nums.length){
            ll.add(new ArrayList<>(l));
            return ;
        }
        for(int i=0;i<nums.length;i++){
            if(l.contains(nums[i])) continue;
            l.add(nums[i]);
            call(nums,ll,l);
            l.remove(l.size()-1);
        }
    }
}