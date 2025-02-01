class Solution {
    int [][][]dir={{{0,1},{0,-1}},{{1,0},{-1,0}},{{0,-1},{1,0}},{{1,0},{0,1}},{{-1,0},{0,-1}},{{-1,0},{0,1}}};
    public boolean hasValidPath(int[][] grid) {
        int n=grid.length;
        int m=grid[0].length;
        boolean [][]vis=new boolean[n][m];
        return call(0,0,n,m,grid,vis);
    }
    public boolean call(int i,int j,int n,int m,int [][]grid,boolean[] []vis){
        if(i==n-1 && j==m-1) return true;
        vis[i][j]=true;
        for(int []next:dir[grid[i][j]-1]){
            int nr=next[0]+i;
            int nc=next[1]+j;
            if(nr<0 || nc<0 || nr>=n || nc>=m || vis[nr][nc]) continue;
            for(int []back:dir[grid[nr][nc]-1]){
                if(nr+back[0]==i && nc+back[1]==j){
                    if(call(nr,nc,n,m,grid,vis)) return true;
                }
            }
        }
        return false;
    }
}