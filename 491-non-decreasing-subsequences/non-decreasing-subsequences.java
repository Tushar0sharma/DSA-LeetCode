class Solution {
    public List<List<Integer>> findSubsequences(int[] nums) {
        Set<List<Integer>>s=new HashSet<>();
        solve(nums,0,s,new ArrayList<>());
        return new ArrayList<>(s);
    }
    public void solve(int[]nums,int i,Set<List<Integer>>s,List<Integer>l){
        if(i>=nums.length){
            if(l.size()>1){
                s.add(new ArrayList<>(l));
            }
            return;
        }
        if(l.isEmpty() || nums[i]>=l.get(l.size()-1)){
            l.add(nums[i]);
            solve(nums,i+1,s,l);
            l.remove(l.size()-1);
        }
        solve(nums,i+1,s,l);
        return;
    }
}