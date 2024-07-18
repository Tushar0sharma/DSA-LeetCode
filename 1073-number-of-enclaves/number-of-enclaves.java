class Solution {
    public int numEnclaves(int[][] grid) {
        int n=grid.length;
        int m=grid[0].length;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if((i==0 || j==0 || i==n-1 || j==m-1) && grid[i][j]==1) dfs(grid,i,j);
            }
        }
        int sum=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                sum+=grid[i][j];
            }
        }
        return sum;
    }
    public void dfs(int [][]grid,int i,int j){
        grid[i][j]=0;
        int [][]dir={{0,1},{1,0},{-1,0},{0,-1}};
        for(int []d:dir){
            int x=d[0]+i;
            int y=d[1]+j;
            if(x>=0 && x<grid.length && y>=0 && y<grid[0].length && grid[x][y]==1) dfs(grid,x,y);
        }
    }
}
