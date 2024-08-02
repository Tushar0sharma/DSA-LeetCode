class Solution {
    public int rob(int[] nums) {
        int n=nums.length;

        int []dp=new int[n];
        Arrays.fill(dp,-1);
        return rob(nums,nums.length-1,dp);
    }
    public int rob(int []nums,int i,int []dp){
        if(i<0){
            return 0;
        }
        if(dp[i]!=-1) return dp[i];
        return dp[i]=Math.max(rob(nums,i-2,dp)+nums[i],rob(nums,i-1,dp));
    }
}