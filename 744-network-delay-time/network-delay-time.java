class Solution {
    public int networkDelayTime(int[][] times, int n, int k) {
        List<List<int[]>>ll=new ArrayList<>();
        int []dist=new int[n+1];
        for(int i=0;i<=n;i++){
            ll.add(new ArrayList<>());
        }
        for(int []i:times){
            ll.get(i[0]).add(new int[]{i[1],i[2]});
        }
        PriorityQueue<int[]>pq=new PriorityQueue<>((a,b)->a[1]-b[1]);
        pq.add(new int[]{k,0});
        Arrays.fill(dist,Integer.MAX_VALUE);
        dist[k]=0;
        while(!pq.isEmpty()){
            int []p=pq.poll();
            int node=p[0];
            int cost=p[1];
            for(int []i:ll.get(node)){
                int nt=i[1]+cost;
                if(dist[i[0]]>nt) {
                    pq.add(new int[]{i[0],nt});
                    dist[i[0]]=nt;
                }
            }
        }
        int max=0;
        for(int i=1;i<=n;i++) {
            max=Math.max(max,dist[i]);
            if(dist[i]==Integer.MAX_VALUE) return -1;
        }
        return max;
    }
}