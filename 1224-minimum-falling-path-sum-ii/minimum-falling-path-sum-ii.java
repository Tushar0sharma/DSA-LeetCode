class Solution {
    public int minFallingPathSum(int[][] grid) {
        int n=grid.length;
        int m=grid[0].length;
        int [][]dp=new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                dp[i][j]=Integer.MAX_VALUE;
            }
        }
        int min=Integer.MAX_VALUE;
        for(int i=0;i<m;i++){
            min=Math.min(min,call(0,i,dp,grid,n,m));
        }
        return min;
    }
    public int call(int i,int j,int [][]dp,int [][]ma,int n,int m){
        if(i==n-1 && j>=0 && j<m) return dp[i][j]=ma[i][j];
        if(j<0 || j>=m || i>=n) return Integer.MAX_VALUE;
        if(dp[i][j]!=Integer.MAX_VALUE) return dp[i][j];
        int min = Integer.MAX_VALUE;
        for (int k = 0; k < n; k++) {
            if (k != j) {
                min = Math.min(min, call(i + 1, k, dp, ma, n,m));
            }
        }
        return dp[i][j]=ma[i][j]+min;
    }
}