class Solution {
    public int numIslands(char[][] grid) {
        int cnt=0;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]=='1'){
                    call(grid,i,j);
                    cnt++;
                }
            }
        }
        return cnt;
    }
    public void call(char[][]g,int i,int j){
        if(i<0 || j<0 || i>=g.length || j>=g[0].length || g[i][j]!='1'){
            return;
        }
        g[i][j]='0';
        call(g,i+1,j);
        call(g,i,j+1);
        call(g,i-1,j);
        call(g,i,j-1);
    }
}