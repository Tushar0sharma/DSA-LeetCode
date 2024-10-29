class Solution {
    public int maxMoves(int[][] grid) {
        int n=grid.length;
        int m=grid[0].length;
        int [][]dp=new int[n][m];
        for(int []i:dp){
            Arrays.fill(i,-1);
        }
        int max=0;
        for(int i=0;i<n;i++){
            max=Math.max(max,call(grid,dp,i,0,n,m));
        }
        return max;
    }
    public int call(int [][]grid,int [][]dp,int i,int j,int n,int m){
        if(dp[i][j]!=-1) return dp[i][j];
        
        int c=0;
        for(int k=-1;k<=1;k++){
            if(i+k>=0 && j+1>=0 && i+k<n && j+1<m && grid[i][j]<grid[i+k][j+1]){
                c=Math.max(call(grid,dp,i+k,j+1,n,m)+1,c);
            }
        }
        return dp[i][j]=c;
    }

}