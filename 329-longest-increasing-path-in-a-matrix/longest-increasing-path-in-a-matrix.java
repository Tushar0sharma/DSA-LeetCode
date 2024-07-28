class Solution {
    public int longestIncreasingPath(int[][] matrix) {
        int n=matrix.length;
        int m=matrix[0].length;
        int [][]dp=new int[n][m];

        for(int []i:dp) Arrays.fill(i,-1);
        int max=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                solve(i,j,matrix,dp,-1);
            }
        }
        for(int i=0;i<n;i++) for(int j=0;j<m;j++) max=Math.max(max,dp[i][j]);
        return max;
    }
    public int solve(int i,int j,int [][]mat,int [][]dp,int prev){
        if(i<0 || j<0 || i>=mat.length || j>= mat[0].length || mat[i][j]<=prev) return 0;
        if(dp[i][j]!=-1) return dp[i][j];

        int l=solve(i,j-1,mat,dp,mat[i][j]);
        int r=solve(i,j+1,mat,dp,mat[i][j]);
        int u=solve(i-1,j,mat,dp,mat[i][j]);
        int d=solve(i+1,j,mat,dp,mat[i][j]);

        dp[i][j] = 1 + Math.max(Math.max(l, r), Math.max(u, d));
        return dp[i][j];
    }
}