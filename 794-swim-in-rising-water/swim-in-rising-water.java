class Solution {
    public int swimInWater(int[][] grid) {
        PriorityQueue<int[]>pq=new PriorityQueue<>((a,b)->a[0]-b[0]);
        pq.add(new int[]{grid[0][0],0,0});
        int n=grid.length;
        boolean [][]vis=new boolean[n][n];
        vis[0][0]=true;
        while(!pq.isEmpty()){
            int p[]=pq.poll();
            int dist=p[0];
            int r=p[1];
            int c=p[2];
            if(r==n-1 && c==n-1) return dist;
            int [][]d={{0,1},{1,0},{-1,0},{0,-1}};
            for(int []i:d){
                int nr=r+i[0];
                int nc=c+i[1];
                if(nr>=0 && nc>=0 && nr<n && nc<n&& !vis[nr][nc]){
                    vis[nr][nc]=true;
                    pq.add(new int[]{Math.max(grid[nr][nc],dist),nr,nc});
                }
            }
        }
        return -1;
    }
}