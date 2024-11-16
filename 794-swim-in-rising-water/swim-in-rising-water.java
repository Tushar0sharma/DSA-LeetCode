class Solution {
    public int swimInWater(int[][] grid) {
        PriorityQueue<int[]>pq=new PriorityQueue<>((a,b)->a[2]-b[2]);
        pq.add(new int[]{0,0,grid[0][0]});
        int n=grid.length;
        int [][]dist=new int[n][n];
        for(int []i:dist) Arrays.fill(i,Integer.MAX_VALUE);
        dist[0][0]=0;
        int [][]dir={{0,1},{1,0},{-1,0},{0,-1}};
        while(!pq.isEmpty()){
            int []p=pq.poll();
            int r=p[0];
            int c=p[1];
            int cost=p[2];
            if(r==n-1 && c==n-1) return cost;
            for(int []i:dir){
                int nr=r+i[0];
                int nc=c+i[1];
                if(nr>=0  && nc>=0 && nc<n && nr<n){
                    int nt=Math.max(cost,grid[nr][nc]);
                    if(dist[nr][nc]>nt){
                        dist[nr][nc]=nt;
                        pq.add(new int[]{nr,nc,nt});
                    }     
                }
            }            
        }
        return -1;
    }
}