class Solution {
    public int lengthOfLIS(int[] nums) {
        int n=nums.length;
        int [][]dp=new int[n+1][n+1];
        for(int []i:dp) Arrays.fill(i,-1);
        return call(1,0,nums,dp);
    }
    public int call(int i,int j,int[]nums,int [][]dp){
        if(i-1==nums.length) return 0;
        if(dp[i][j]!=-1) return dp[i][j];
        int nt=call(i+1,j,nums,dp);
        int tk=0;
        if(j==0 || nums[j-1]<nums[i-1]){
            tk=call(i+1,i,nums,dp)+1;
        } 
        return dp[i][j]=Math.max(tk,nt);
    }
}