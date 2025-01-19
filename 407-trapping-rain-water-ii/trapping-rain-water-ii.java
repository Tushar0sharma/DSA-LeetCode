class Solution {
    public int trapRainWater(int[][] heightMap) {
        PriorityQueue<int[]>pq=new PriorityQueue<>((a,b)->a[0]-b[0]);
        int n=heightMap.length;
        int m=heightMap[0].length;
        boolean [][]vis=new boolean[n][m];
        for(int i=0;i<n;i++){
            pq.add(new int[]{heightMap[i][0],i,0});
            pq.add(new int[]{heightMap[i][m-1],i,m-1});
            vis[i][0]=vis[i][m-1]=true;
        }
        for(int i=0;i<m;i++){
            pq.add(new int[]{heightMap[0][i],0,i});
            pq.add(new int[]{heightMap[n-1][i],n-1,i});
            vis[0][i]=vis[n-1][i]=true;
        }
        int ans=0;
        int[][]dir={{1,0},{0,1},{-1,0},{0,-1}};
        while(!pq.isEmpty()){
            int []p=pq.poll();
            for(int []i:dir){
                int nr=p[1]+i[0];
                int nc=p[2]+i[1];
                if(nr>=0 && nc>=0 && nc<m && nr<n && !vis[nr][nc]){
                    vis[nr][nc]=true;
                    ans+=Math.max(0,p[0]-heightMap[nr][nc]);
                    pq.add(new int[]{Math.max(p[0],heightMap[nr][nc]),nr,nc});
                }
            }
        }
        return ans;
    }
}