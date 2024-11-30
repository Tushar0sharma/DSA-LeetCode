class Solution {
    public int minimumObstacles(int[][] grid) {
        PriorityQueue<int[]>pq=new PriorityQueue<>((a,b)->a[2]-b[2]);
        pq.add(new int[]{0,0,0});
        int n=grid.length;
        int m=grid[0].length;
        int [][]vis=new int [n][m];
        for(int []i:vis){
            Arrays.fill(i,Integer.MAX_VALUE);
        }
        int [][]dir={{0,1},{1,0},{-1,0},{0,-1}};
        while(!pq.isEmpty()){
            int []p=pq.poll();
            int r=p[0];
            int c=p[1];
            int t=p[2];
            if(r==n-1 && c==m-1) return t;
            for(int []i:dir){
                int nr=r+i[0];
                int nc=c+i[1];
                if(nr>=0 && nc>=0 && nr<n && nc<m){
                    int nt=t+grid[nr][nc];
                    if(vis[nr][nc]>nt){
                        vis[nr][nc]=nt;
                        pq.add(new int[]{nr,nc,nt});
                    }
                }
            }
        }
        return -1;
    }
}