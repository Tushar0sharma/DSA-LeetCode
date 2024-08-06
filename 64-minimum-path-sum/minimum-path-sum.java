class Solution {
    public int minPathSum(int[][] grid) {
        int n=grid.length;
        int m=grid[0].length;
        int [][]dp=new int[n][m];
        for(int i[]:dp) Arrays.fill(i,-1);
        return call(dp,grid,n-1,m-1);
    }
    public int call(int [][]dp,int [][]grid,int n,int m){
        if(n==0 && m==0) return grid[n][m];
        if(n<0 || m<0) return Integer.MAX_VALUE;
        if(dp[n][m]!=-1) return dp[n][m];
        int l=call(dp,grid,n-1,m);
        int r=call(dp,grid,n,m-1);
        dp[n][m]=grid[n][m]+Math.min(l,r);
        return dp[n][m];
    }
}