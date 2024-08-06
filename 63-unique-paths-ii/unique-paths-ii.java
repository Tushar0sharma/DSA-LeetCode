class Solution {
    public int uniquePathsWithObstacles(int[][] o) {
        if(o[o.length-1][o[0].length-1]==1 || o[0][0]==1) return 0;
        int [][]dp=new int[o.length][o[0].length];
        for(int []i:dp) Arrays.fill(i,-1);
        return call(o,dp,o.length-1,o[0].length-1);
    }
    public int call(int [][]o,int [][]dp,int n,int m){
        if(n==0 && m==0) return 1;
        if(n<0 || m<0 || o[n][m]==1) return 0;
        if(dp[n][m]!=-1) return dp[n][m];
        dp[n][m]=call(o,dp,n-1,m);
        dp[n][m]+=call(o,dp,n,m-1);
        return dp[n][m];
    }
}