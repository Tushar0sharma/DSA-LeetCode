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