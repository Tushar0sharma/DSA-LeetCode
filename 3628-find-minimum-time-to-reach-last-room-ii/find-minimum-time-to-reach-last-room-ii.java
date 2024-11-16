class Solution {
    public int minTimeToReach(int[][] moveTime) {
        PriorityQueue<int[]>pq=new PriorityQueue<>((a,b)->a[0]-b[0]);
        int n=moveTime.length;
        int m=moveTime[0].length;
        boolean [][]vis=new boolean[n][m];
        // for(int []i:vis) Arrays.fill(i,Integer.MAX_VALUE);
        vis[0][0]=true;
        pq.add(new int[]{0,0,0,1});
        int [][]dir={{0,1},{1,0},{-1,0},{0,-1}};
        while(!pq.isEmpty()){
            int []p=pq.poll();
            int r=p[1];
            int c=p[2];
            int t=p[0];
            int k=p[3];
            if(r==n-1 && c==m-1) return t;
            for(int []d:dir){
                int nr=r+d[0];
                int nc=c+d[1];
                if(nr>=0 && nc>=0 && nr<n && nc<m && !vis[nr][nc]){
                    int nt=Math.max(moveTime[nr][nc],t)+k;
                    int f=k==1?2:1;
                    vis[nr][nc]=true;
                    // if(vis[nr][nc]>nt){
                        // vis[nr][nc]=nt;
                        pq.add(new int[]{nt,nr,nc,f});
                    // }
                }
            }
        }
        return -1;
    }
}