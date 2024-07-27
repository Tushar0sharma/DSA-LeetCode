class pair{
    int source;
    int w;
    pair(int source,int w){
        this.source=source;
        this.w=w;
    }
}
class Solution {
    public int findTheCity(int n, int[][] edges, int distanceThreshold) {
        List<List<int[]>>ll=new ArrayList<>();
        for(int i=0;i<n;i++) ll.add(new ArrayList<>());
        for(int []i:edges){
            ll.get(i[0]).add(new int[]{i[1],i[2]});
            ll.get(i[1]).add(new int[]{i[0],i[2]});
        }
        int[][]dist=new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(i==j) dist[i][j]=0;
                else dist[i][j]=Integer.MAX_VALUE;
            }
        }
        for(int i=0;i<n;i++){
            bfs(i,ll,dist[i],n);
        }
        for(int []i:dist) for(int j:i) System.out.print(j+" ");
        return getcity(distanceThreshold,n,dist);
        // return 0;
    }
    public int getcity(int k,int n,int[][]dist){
        int cnt=n;
        int city=-1;
        for(int i=0;i<n;i++){
            int cnt1=0;
            for(int j=0;j<n;j++){
                if(i==j) continue;
                else if(dist[i][j]<=k) cnt1++;
            }
            if(cnt1<=cnt){
                cnt=cnt1;
                city=i;
            }
        }
        return city;
    }
    public void bfs(int src,List<List<int[]>>ll,int[]dist,int n){
        PriorityQueue<pair>pq=new PriorityQueue<>((a,b)->a.w-b.w);
        pq.add(new pair(src,0));
        while(!pq.isEmpty()){
            pair p=pq.poll();
            int node=p.source;
            int weight=p.w;
            for(int []i:ll.get(node)){
                if(weight+i[1]<dist[i[0]]){
                    dist[i[0]]=weight+i[1];
                    pq.add(new pair(i[0],dist[i[0]]));
                }
            }
        }
    }

}