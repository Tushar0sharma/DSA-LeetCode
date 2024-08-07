// class Solution {
//     public int minPathSum(int[][] grid) {
//         int n=grid.length;
//         int m=grid[0].length;
//         int [][]dp=new int[n][m];
//         for(int i[]:dp) Arrays.fill(i,-1);
//         return call(dp,grid,n-1,m-1);
//     }
//     public int call(int [][]dp,int [][]grid,int n,int m){
//         if(n==0 && m==0) return grid[n][m];
//         if(n<0 || m<0) return Integer.MAX_VALUE;
//         if(dp[n][m]!=-1) return dp[n][m];
//         int l=call(dp,grid,n-1,m);
//         int r=call(dp,grid,n,m-1);
//         dp[n][m]=grid[n][m]+Math.min(l,r);
//         return dp[n][m];
//     }
// }
// class Solution {
//     public int minPathSum(int[][] grid) {
//         int n=grid.length;
//         int m=grid[0].length;
//         int [][]dp=new int[n][m];
//         for(int i[]:dp) Arrays.fill(i,Integer.MAX_VALUE);
//         dp[0][0]=grid[0][0];
//         for(int i=0;i<n;i++){
//             for(int j=0;j<m;j++){
//                 if(i-1>=0) dp[i][j]=Math.min(dp[i][j],dp[i-1][j]+grid[i][j]);
//                 if(j-1>=0) dp[i][j]=Math.min(dp[i][j],dp[i][j-1]+grid[i][j]);
//             }
//         }
//         return dp[n-1][m-1];
//     }
// }
class Solution {
    public int minPathSum(int[][] grid) {
        int n=grid.length;
        int m=grid[0].length;
        int []dp=new int[m];
        for(int i=0;i<n;i++){
            int []temp=new int[m];
            for(int j=0;j<m;j++){
                if(i==0 && j==0) temp[j]=grid[0][0];
                else{
                    int up = (i > 0) ? dp[j] + grid[i][j] : Integer.MAX_VALUE;
                    int left = (j > 0) ? temp[j - 1] + grid[i][j] : Integer.MAX_VALUE;
                    temp[j] = Math.min(up, left);
                }
            }
            dp=temp;
        }
        return dp[m-1];
    }
}