class Solution {
    public int minFallingPathSum(int[][] matrix) {
        int n=matrix.length;
        int m=matrix[0].length;
        int [][]dp=new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                dp[i][j] = Integer.MAX_VALUE;
            }
        }
        for (int j = 0; j < m; j++) {
            dp[n-1][j] = matrix[n-1][j];
        }
        int min=Integer.MAX_VALUE;
        for(int i=0;i<m;i++){
            min=Math.min(min,call(0,i,dp,matrix,n,m));
        }for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(dp[i][j]+" ");
            }
            System.out.println();
        }
        return min;
    }
    public int call(int i,int j,int [][]dp,int [][]ma,int n,int m){
        if(i==n-1 && j<m && j>=0) return dp[i][j]=ma[i][j];
        if(i>=n || j>=m || j<0) return Integer.MAX_VALUE;
        if(dp[i][j]!=Integer.MAX_VALUE) return dp[i][j];
        int d=call(i+1,j,dp,ma,n,m);
        int dl=call(i+1,j-1,dp,ma,n,m);
        int dr=call(i+1,j+1,dp,ma,n,m);
        return dp[i][j]=ma[i][j]+Math.min(d,Math.min(dr,dl));
    }
}