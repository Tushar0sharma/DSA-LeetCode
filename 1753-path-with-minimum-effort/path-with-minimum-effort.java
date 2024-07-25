class pair{
    int row;
    int col;
    pair(int row,int col){
        this.row=row;
        this.col=col;
    }
}
class Solution {
    public int minimumEffortPath(int[][] heights) {
        int n=heights.length;
        int m=heights[0].length;
        int [][]dist=new int[n][m];
        for(int i=0;i<n;i++) for(int j=0;j<m;j++) dist[i][j]=Integer.MAX_VALUE;
        Queue<pair>q=new LinkedList<>();
        q.add(new pair(0,0));
        dist[0][0]=0;
        while(!q.isEmpty()){
            int r=q.peek().row;
            int c=q.peek().col;
            q.poll();
            int [][]dir={{1,0},{0,1},{-1,0},{0,-1}};
            for(int[] i:dir){
                int nr=i[0]+r;
                int nc=i[1]+c;
                if(nr>=0  && nr<n && nc>=0 && nc<m ){
                    int newEffort = Math.max(dist[r][c], Math.abs(heights[nr][nc] - heights[r][c]));
                    if( newEffort< dist[nr][nc]){
                        dist[nr][nc]=newEffort;
                        q.add(new pair(nr,nc));
                    }
                }
            }
        }
        for(int i=0;i<n;i++) for(int j=0;j<m;j++) System.out.print(dist[i][j]+" ");
        return dist[n-1][m-1];
    }
}