class Solution {
    public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>>ll=new ArrayList<>();
        List<Integer>l=new ArrayList<>();
        boolean[]used=new boolean[nums.length];
        Arrays.sort(nums);
        print(nums,l,ll,used);
        return ll;
    }
    public void print(int[]nums,List<Integer>l,List<List<Integer>>ll,boolean[]used){
        if(l.size()==nums.length){
            ll.add(new ArrayList<>(l));
            return;
        }
        for(int i=0;i<nums.length;i++){
            if(used[i]) continue;
            if(i>0 && nums[i]==nums[i-1] && !used[i-1]) continue;
            used[i]=true;
            l.add(nums[i]);
            print(nums,l,ll,used);
            used[i]=false;
            l.remove(l.size()-1);            
        }
    }
}