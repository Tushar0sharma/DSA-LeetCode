class Solution {
    public boolean canPartition(int[] nums) {
        int sum=0;
        for(int i:nums) sum+=i;
        if(sum%2!=0) return false;
        Boolean [][]dp=new Boolean[nums.length][sum/2];
        return call(sum/2,nums,0,0,dp);
    }
    public boolean call(int k,int []nums,int i,int sum,Boolean [][]dp){
        if(sum==k) return true;
        if(i==nums.length || sum>k) return false;
        if(dp[i][sum]!=null) return dp[i][sum];
        return dp[i][sum]=call(k,nums,i+1,sum+nums[i],dp)||call(k,nums,i+1,sum,dp);
    }
}