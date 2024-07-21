class pair{
    int row;
    int col;
    int steps;
    pair(int row,int col,int steps){
        this.row=row;
        this.col=col;
        this.steps=steps;
    }
}
class Solution {
    public int[][] updateMatrix(int[][] mat) {
        int n=mat.length;
        int m=mat[0].length;
        int [][]vis=new int[n][m];
        int [][]dist=new int[n][m];

        Queue<pair>q=new LinkedList<>();
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(mat[i][j]==0){
                    vis[i][j]=1;
                    q.add(new pair(i,j,0));
                }
                else vis[i][j]=0;
            }
        }

        int []r={0,0,-1,1};
        int []c={1,-1,0,0};

        while(!q.isEmpty()){
            int row=q.peek().row;
            int col=q.peek().col;
            int steps=q.peek().steps;
            q.poll();
            dist[row][col]=steps;

            for(int i=0;i<4;i++){
                int nr=r[i]+row;
                int nc=c[i]+col;

                if(nr>=0 && nc>=0 && nr<n && nc<m && vis[nr][nc]==0){
                    vis[nr][nc]=1;
                    q.add(new pair(nr,nc,steps+1));
                }
            }
        }
        return dist;
    }
}