class Solution {
    public int uniquePathsWithObstacles(int[][] o) {
        if(o[o.length-1][o[0].length-1]==1 || o[0][0]==1) return 0;
        int n=o.length;
        int m=o[0].length;
        int [][]dp=new int[o.length][o[0].length];
        dp[0][0]=1;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(o[i][j]==1) dp[i][j]=0;
                else{
                    if(i-1>=0) dp[i][j]=dp[i-1][j];
                    if(j-1>=0) dp[i][j]+=dp[i][j-1];
                }
            }
        }
        return dp[n-1][m-1];
    }
}