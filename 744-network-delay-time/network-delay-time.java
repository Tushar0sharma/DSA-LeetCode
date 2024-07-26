class Solution {
    public int networkDelayTime(int[][] times, int n, int k) {
        PriorityQueue<int[]>pq=new PriorityQueue<>((a,b)->a[1]-b[1]);
        pq.add(new int[]{k,0});
        List<List<int []>> ll = new ArrayList<>();
        for(int i=0; i<=n; i++) ll.add(new ArrayList<>());
        for(int i=0; i<times.length; i++){
            ll.get(times[i][0]).add(new int[]{times[i][1],times[i][2]});
        }
        boolean[]vis=new boolean[n+1];

        int max=0;
        int []time=new int[n+1];
        Arrays.fill(time,Integer.MAX_VALUE);
        time[k]=0;

        while(!pq.isEmpty()){
            int []node=pq.poll();
            int dest=node[0];
            int w=node[1];
            if(vis[dest]) continue;
            vis[dest]=true;
            max=Math.max(max,w);
            for(int []i:ll.get(dest)){
                int u=i[0];
                int v=i[1];
                if(w+v<time[u]){
                    time[u]=w+v;
                    pq.add(new int[]{u,time[u]});
                }
            }
        }
        for (int i = 1; i <= n; i++) {
            if (time[i] == Integer.MAX_VALUE) {
                return -1; 
            }
        }
        return max;
    }
}