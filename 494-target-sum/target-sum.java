class Solution {
    public int findTargetSumWays(int[] nums, int target) {
        return cal(nums,target,0,0);
    }
    public int cal(int []nums,int t,int sum,int i){
        if(i==nums.length){
            if(sum==t){
                return 1;
            }
            return 0;
        }
        int take1=cal(nums,t,sum+nums[i],i+1);
        int take2=cal(nums,t,sum-nums[i],i+1);
        return take1+take2;
    }
}