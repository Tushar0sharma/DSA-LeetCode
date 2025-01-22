class Solution {
    public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>>ll=new ArrayList<>();
        List<Integer>l=new ArrayList<>();
        Arrays.sort(nums);
        boolean[]used=new boolean[nums.length];
        call(ll,l,used,nums);
        return ll;
    }
    public void call(List<List<Integer>>ll,List<Integer>l,boolean[]used,int[]nums){
        if(l.size()==nums.length){
            ll.add(new ArrayList<>(l));
            return;
        }
        for(int i=0;i<nums.length;i++){
            if(used[i]) continue;
            if(i+1<nums.length && nums[i]==nums[i+1] &&!used[i+1]) continue;
            used[i]=true;
            l.add(nums[i]);
            call(ll,l,used,nums);
            l.remove(l.size()-1);
            used[i]=false;
        }
    }
}