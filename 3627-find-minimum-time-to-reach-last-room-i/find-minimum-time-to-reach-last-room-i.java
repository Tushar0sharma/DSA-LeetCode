class Solution {
    public int minTimeToReach(int[][] movetime) {
        int n=movetime.length;
        int m=movetime[0].length;
        int [][]dist=new int[n][m];
        for(int []i:dist){
            Arrays.fill(i,Integer.MAX_VALUE);
        }
        PriorityQueue<int[]>pq=new PriorityQueue<>((a,b)->a[0]-b[0]);
        pq.add(new int[]{0,0,0});
        int []dx={0,0,-1,1};
        int []dy={1,-1,0,0};
        dist[0][0]=0;
        while(!pq.isEmpty()){
            int []p=pq.poll();
            int r=p[1];
            int c=p[2];
            int time=p[0];
            if(r==n-1 && c==m-1){
                return time;
            }
            for(int i=0;i<4;i++){
                int nr=r+dx[i];
                int nc=c+dy[i];
                if(nr>=0 && nc>=0 && nr<n && nc<m){
                    int nt=Math.max(movetime[nr][nc],time)+1;
                    if(dist[nr][nc]>nt){
                        dist[nr][nc]=nt;
                        pq.add(new int[]{nt,nr,nc});
                    }
                }
            }
        }
        return -1;
    }
}