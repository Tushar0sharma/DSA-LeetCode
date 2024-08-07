// class Solution {
//     public int minFallingPathSum(int[][] matrix) {
//         int n=matrix.length;
//         int m=matrix[0].length;
//         int [][]dp=new int[n][m];
//         for (int i = 0; i < n; i++) {
//             for (int j = 0; j < m; j++) {
//                 dp[i][j] = Integer.MAX_VALUE;
//             }
//         }
//         for(int i=0;i<m;i++){
//             dp[n-1][i]=matrix[n-1][i];
//         }
//         for(int i=n-2;i>=0;i--){
//             for(int j=0;j<m;j++){
//                 int dl=Integer.MAX_VALUE;
//                 if(j-1>=0) dl=dp[i+1][j-1]+matrix[i][j];
//                 int dr=Integer.MAX_VALUE;
//                 if(j+1<m) dr=dp[i+1][j+1]+matrix[i][j];
//                 int d=matrix[i][j]+dp[i+1][j];

//                 dp[i][j]=Math.min(d,Math.min(dl,dr));
//             }
//         }
//         int min=Integer.MAX_VALUE;
//         for(int i=0;i<m;i++){
//             min=Math.min(min,dp[0][i]);
//         }
//         return min;
//     }
// }
class Solution {
    public int minFallingPathSum(int[][] matrix) {
        int n=matrix.length;
        int m=matrix[0].length;
        int []dp=new int[m];
        for(int i=0;i<m;i++){
            dp[i]=matrix[n-1][i];
        }
        for(int i=n-2;i>=0;i--){
            int []temp=new int[m];
            for(int j=0;j<m;j++){
                int dl=Integer.MAX_VALUE;
                if(j-1>=0) dl=dp[j-1]+matrix[i][j];
                int dr=Integer.MAX_VALUE;
                if(j+1<m) dr=dp[j+1]+matrix[i][j];
                int d=matrix[i][j]+dp[j];

                temp[j]=Math.min(d,Math.min(dl,dr));
            }
            dp=temp;
        }
        int min=Integer.MAX_VALUE;
        for(int i=0;i<m;i++){
            min=Math.min(min,dp[i]);
        }
        return min;
    }
}