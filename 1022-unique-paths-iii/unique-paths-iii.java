class Solution {
    public int uniquePathsIII(int[][] grid) {
        int []cnt=new int[1];
        int total=0,start=0,end=0;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]==1){
                    start=i;
                    end=j;
                }
                if(grid[i][j]==0) total++;
            }
        }
        fine(grid,start,end,total,cnt,0);
        return cnt[0];
    }
    public void fine(int [][]grid,int row,int col,int total,int []cnt,int zero ){
         if(row>=grid.length ||col>=grid[0].length || row<0 || col<0 || grid[row][col]==-1){
            return;
        }
        if(grid[row][col]==2 && total==zero-1 ){
            cnt[0]++;
            return;
        }else if(grid[row][col]==2) return;
        int []r={0,0,1,-1};
        int[]c={1,-1,0,0};
        grid[row][col]=-1;
        for(int i=0;i<c.length;i++){
            fine(grid,row+r[i],col+c[i],total,cnt,zero+1);
        }
        grid[row][col]=0;
    }
}