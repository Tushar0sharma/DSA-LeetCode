class Solution {
    public int[] twoSum(int[] nums, int k) {
        Map<Integer,Integer>mp=new HashMap<>();
        int []ans=new int[2];
        ans[0]=-1;
        ans[1]=-1;
        for(int i=0;i<nums.length;i++){
            if(mp.containsKey(k-nums[i])){
                ans[0]=mp.get(k-nums[i]);
                ans[1]=i;
                return ans;
            }
            mp.put(nums[i],i);
        }
        return ans;
    }
}