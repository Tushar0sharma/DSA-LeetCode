class Solution {
    public int minCostConnectPoints(int[][] points) {
        int n=points.length;
        int []par=new int[n];
        for(int i=0;i<n;i++) par[i]=i;
        PriorityQueue<int[]>pq=new PriorityQueue<>((a,b)->a[0]-b[0]);
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                pq.add(new int[]{Math.abs(points[j][0]-points[i][0])+Math.abs(points[j][1]-points[i][1]),i,j});
            }
        }
        int cnt=0;
        int ans=0;
        while(cnt<n-1){
            int []p=pq.poll();
            int r=find(p[1],par);
            int c=find(p[2],par);
            if(r!=c){
                ans+=p[0];
                cnt++;
                union(r,c,par);
            }
        }
        return ans;
    }
    public int find(int p,int []par){
        if(p==par[p]) return p;
        return par[p]=find(par[p],par);
    }
    public void union(int u,int v,int []par){
        int pu=find(u,par);
        int pv=find(v,par);
        if(pv==pu) return;
        par[pu]=pv;
    }
}