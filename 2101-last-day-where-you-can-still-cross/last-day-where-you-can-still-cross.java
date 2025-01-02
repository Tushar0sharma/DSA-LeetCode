class Solution {
    public int latestDayToCross(int row, int col, int[][] cells) {
        int max=0;
        int n=cells.length;
        int [][]grid=new int[row][col];
        for(int i=0;i<n;i++){
            int r=cells[i][0]-1;
            int c=cells[i][1]-1;
            grid[r][c]=1;
            if(dfs(grid)) max++;
            else break;
        }
        return max;
    }
    public boolean dfs(int [][]grid){
        int n=grid[0].length;
        for(int i=0;i<n;i++){
            if(grid[0][i]==0 && call(grid,0,i,new boolean[grid.length][n])) return true;
        }
        return false;
    }
    public boolean call(int[][]grid,int i,int j,boolean [][]vis){
        if(i<0 || j<0 || i>=grid.length || j>=grid[0].length || vis[i][j] || grid[i][j]==1) return false;
        if(i==grid.length-1) return true;
        vis[i][j]=true;
        return call(grid,i+1,j,vis)||call(grid,i-1,j,vis)||call(grid,i,j-1,vis)||call(grid,i,j+1,vis);
    }
}