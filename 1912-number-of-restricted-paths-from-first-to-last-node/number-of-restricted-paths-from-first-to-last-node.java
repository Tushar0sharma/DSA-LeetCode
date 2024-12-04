class Solution {
    public int countRestrictedPaths(int n, int[][] edges) {
        int []dist=new int[n+1];
        PriorityQueue<int[]>pq=new PriorityQueue<>((a,b)->a[1]-b[1]);
        pq.add(new int[]{n,0});
        Arrays.fill(dist,Integer.MAX_VALUE);
        List<List<int[]>>ll=new ArrayList<>();
        for(int i=0;i<=n;i++){
            ll.add(new ArrayList<>());
        }
        for(int []i:edges){
            ll.get(i[0]).add(new int[]{i[1],i[2]});
            ll.get(i[1]).add(new int[]{i[0],i[2]});
        }
        dist[n]=0;
        while(!pq.isEmpty()){
            int []p=pq.poll();
            int d=p[0];
            int t=p[1];
            if(dist[d]!=t) continue;
            for(int []i:ll.get(d)){
                int nt=t+i[1];
                if(dist[i[0]]>nt){
                    dist[i[0]]=nt;
                    pq.add(new int[]{i[0],nt});
                }
            }
        }
        return call(ll,dist,1,n,new Integer[n+1]);
    }
    public int call(List<List<int[]>>ll,int []dist,int src,int n,Integer []memo){
        if(memo[src]!=null) return memo[src];
        if(src==n) return 1;
        int ans=0;
        for(int []i:ll.get(src)){
            if(dist[src]>dist[i[0]]){
                ans=(ans+call(ll,dist,i[0],n,memo))%1000000007;
            }
        }
        return memo[src]=ans;
    }
}