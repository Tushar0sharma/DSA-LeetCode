class Solution {
    public int minSteps(int n) {
        if(n==1) return 0;
        int [][]dp=new int[n+1][n/2+1];
        return 1+call(1,n,1,dp);
    }
    public int call(int i,int n,int j,int [][]dp){
        if(i==n) return 0;
        if(i>n) return 1000;
        if(dp[i][j]!=0) return dp[i][j];
        return dp[i][j]=Math.min(2+call(i*2,n,i,dp),1+call(i+j,n,j,dp));
    }
}