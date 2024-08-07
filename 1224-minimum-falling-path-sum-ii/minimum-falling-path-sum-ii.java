class Solution {
    public int minFallingPathSum(int[][] grid) {
        int n=grid.length;
        int m=grid[0].length;
        int [][]dp=new int[n][m];
        dp=grid;
        int min=Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                int mm=Integer.MAX_VALUE;
                for(int k=0;i-1>=0 && k<m;k++){
                    if(k!=j){
                        mm=Math.min(mm,dp[i-1][k]);
                    }
                }
                if(mm!=Integer.MAX_VALUE) dp[i][j]+=mm;
                else dp[i][j]+=0;
                if(i==n-1) min=Math.min(min,dp[n-1][j]);
            }
        }
        return min;
    }
}