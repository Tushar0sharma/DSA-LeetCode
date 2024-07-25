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
    public int minimumEffortPath(int[][] heights) {
        int n=heights.length;
        int m=heights[0].length;
        int [][]dist=new int[n][m];
        for(int i=0;i<n;i++) for(int j=0;j<m;j++) dist[i][j]=Integer.MAX_VALUE;
        PriorityQueue<pair>q=new PriorityQueue<>((a,b)->a.k-b.k);
        q.add(new pair(0,0,0));
        dist[0][0]=0;
        while(!q.isEmpty()){
            int r=q.peek().row;
            int c=q.peek().col;
            int curr=q.peek().k;
            if(r==n-1 && c==m-1) return curr;
            q.poll();
            int [][]dir={{1,0},{0,1},{-1,0},{0,-1}};
            for(int[] i:dir){
                int nr=i[0]+r;
                int nc=i[1]+c;
                if(nr>=0  && nr<n && nc>=0 && nc<m ){
                    int newEffort = Math.max(curr, Math.abs(heights[nr][nc] - heights[r][c]));
                    if( newEffort< dist[nr][nc]){
                        dist[nr][nc]=newEffort;
                        q.add(new pair(nr,nc,newEffort));
                    }
                }
            }
        }
        for(int i=0;i<n;i++) for(int j=0;j<m;j++) System.out.print(dist[i][j]+" ");
        return dist[n-1][m-1];
    }
}