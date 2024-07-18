class pair{
    int row;
    int col;
    int t;
    pair(int row,int col,int t){
        this.row=row;
        this.col=col;
        this.t=t;
    }
}
class Solution {
    public int orangesRotting(int[][] grid) {
        int n=grid.length;
        int m=grid[0].length;
        int [][]vis=new int[n][m];
        Queue<pair>q=new LinkedList<>();
        int cntf=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j]==2){
                    vis[i][j]=2;
                    q.add(new pair(i,j,0));
                }
                else vis[i][j]=0;
                if(grid[i][j]==1) cntf++;
            }
        }
        int tm=0;
        int cnt=0;
        int row[]={0,0,1,-1};
        int []col={1,-1,0,0};
        while(!q.isEmpty()){
            int r=q.peek().row;
            int c=q.peek().col;
            int time=q.peek().t;
            tm=Math.max(tm,time);
            q.poll();
            for(int i=0;i<4;i++){
                int nr=r+row[i];
                int nc=c+col[i];
                if(nc>=0 && nr>=0 && nr<n && nc<m && vis[nr][nc]==0 && grid[nr][nc]==1){
                    q.add(new pair(nr,nc,time+1));
                    vis[nr][nc]=2;
                    cnt++;
                }
            }
        }
        if(cnt!=cntf) return -1;
        return tm;
    }
}