class Solution {
    public int shortestPathBinaryMatrix(int[][] grid) {
        int n=grid.length;
        if(grid[0][0]!=0 || grid[n-1][n-1]!=0) return -1;

        int [][]dir={{1,0},{0,1},{-1,0},{0,-1},{-1,1},{1,-1},{1,1},{-1,-1}};
        PriorityQueue<int[]>pq=new PriorityQueue<>((a,b)->a[0]-b[0]);
        int [][]dist=new int[n][n];
        for(int []i:dist){
            Arrays.fill(i,Integer.MAX_VALUE);
        }
        pq.add(new int[]{1,0,0});
        dist[0][0]=0;
        while(!pq.isEmpty()){
            int[] p=pq.poll();
            int t=p[0];
            int r=p[1];
            int c=p[2];
            if(r==n-1 && c==n-1) return t;

            for(int []i:dir){
                int nr=r+i[0];
                int nc=c+i[1];
                int nt=t+1;
                if(nr>=0 && nc>=0 && nr<n && nc<n && grid[nr][nc]==0 && dist[nr][nc]>nt){
                    dist[nr][nc]=nt;
                    pq.add(new int[]{nt,nr,nc});
                }
            }
        }
        return -1;
    }
}