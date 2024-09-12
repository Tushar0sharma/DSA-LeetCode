class Solution {
    public int lengthOfLIS(int[] nums) {
        int n=nums.length;
        int [][]dp=new int[n+1][n+1];
        
        return call(1,0,dp,nums);
    }
    public int call(int i,int j,int [][]dp,int []nums){
        if(i==nums.length+1) return 0;
        if(dp[i][j]!=0) return dp[i][j];
        int nottake=call(i+1,j,dp,nums);
        if(j==0 || nums[j-1]<nums[i-1]){
            nottake=Math.max(nottake,1+call(i+1,i,dp,nums));
        }
        return dp[i][j]=nottake;
    }
}