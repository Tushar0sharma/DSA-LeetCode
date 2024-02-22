class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ll=new ArrayList<>();
        List<Integer> l=new ArrayList<>();
        print(nums,0,l,ll);
        return ll;
    }
    static void print(int[]nums,int i,List<Integer>l,List<List<Integer>> ll){
        if(i==nums.length){
            ll.add(new ArrayList<>(l));
            return ;
        }
        print(nums,i+1,l,ll);
        l.add(nums[i]);
        print(nums,i+1,l,ll);
        l.remove(l.size()-1);

    }
}