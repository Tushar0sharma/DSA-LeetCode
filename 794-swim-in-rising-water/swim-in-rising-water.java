class pair{
    int row;
    int col;
    int k;
    pair(int row,int col,int k){
        this.row=row;
        this.col=col;
        this.k=k;
    }
}
class Solution {
    public int swimInWater(int[][] grid) {
        PriorityQueue<pair>q=new PriorityQueue<>((a,b)->a.k-b.k);
        q.add(new pair(0,0,grid[0][0]));
        int n=grid.length;
        int m=grid[0].length;
        boolean [][]vis=new boolean[n][m];
        vis[0][0]=true;
        int min=0;
        while(!q.isEmpty()){
            pair p=q.poll();
            int r=p.row;
            int c=p.col;
            int k=p.k;
            if(r==n-1 && c==m-1){
                min=k;
                break;
            }
            int [][]dir={{0,1},{1,0},{-1,0},{0,-1}};
            for(int []i:dir){
                int nr=i[0]+r;
                int nc=i[1]+c;
                if(nr<0 ||nr==n || nc<0 || nc==m || vis[nr][nc]) continue;
                vis[nr][nc]=true;
                q.add(new pair(nr,nc,Math.max(k,grid[nr][nc])));
            }
        }
        return min;
    }
}