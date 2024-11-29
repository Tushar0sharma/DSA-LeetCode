class Solution {
    public int minimumTime(int[][] grid) {
        int n=grid.length;
        int m=grid[0].length;
        boolean[][]vis=new boolean[n][m];
        if(grid[0][1]>1 && grid[1][0]>1) return -1;
        PriorityQueue<int[]>pq=new PriorityQueue<>((a,b)->a[2]-b[2]);
        pq.add(new int[]{0,0,0});
        int[][]dir={{0,1},{1,0},{-1,0},{0,-1}};
        while(!pq.isEmpty()){
            int []p=pq.poll();
            int r=p[0];
            int c=p[1];
            int d=p[2];
            if(r==n-1 && c==m-1) return d;
            if(vis[r][c]) continue;
            vis[r][c]=true;
            for(int[]i:dir){
                int nr=i[0]+r;
                int nc=c+i[1];
                if(nr>=0&&nc>=0 && nr<n && nc<m && !vis[nr][nc]){
                    int wt=((grid[nr][nc]-d)%2==0)?1:0;
                    int nt=Math.max(wt+grid[nr][nc],d+1);
                    pq.add(new int[]{nr,nc,nt});
                }
            }
        }
        return -1;
    }
}