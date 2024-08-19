class Solution {
    public boolean canPartition(int[] nums) {
        int sum=0;
        for(int i:nums) sum+=i;
        int reqSum=sum/2;
        int n=nums.length;
        // if(n==1) return false;
        if(sum%2!=0) return false;
        boolean [][]dp=new boolean [n][reqSum+1];
        dp[0][0]=true;
        if(nums[0]<=reqSum) dp[0][nums[0]]=true;
        for(int i=1;i<n;i++){
            dp[i][0]=true;
            for(int j=1;j<=reqSum;j++){
                boolean nottake=dp[i-1][j];
                boolean take=false;
                if(nums[i]<=j) take=dp[i-1][j-nums[i]];
                dp[i][j]=take||nottake;
            }
        }
        return dp[n-1][reqSum];
    }
}