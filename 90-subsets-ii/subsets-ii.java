class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>>ll=new ArrayList<>();
        List<Integer>l=new ArrayList<>();
        Arrays.sort(nums);
        print(l,ll,nums,0);
        return ll;
        
    }
    public void print( List<Integer>l,List<List<Integer>>ll,int []nums,int i){
        ll.add(new ArrayList<>(l));
        for(int k=i;k<nums.length;k++){
        if(k>i&&nums[k]==nums[k-1]) continue;
        l.add(nums[k]);
        print(l,ll,nums,k+1);
        l.remove(l.size()-1);
        }    
    } 
}