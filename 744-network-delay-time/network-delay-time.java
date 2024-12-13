class Solution {
    public int networkDelayTime(int[][] times, int n, int k) {
        List<List<int[]>>ll=new ArrayList<>();
        for(int i=0;i<=n;i++) ll.add(new ArrayList<>());
        for(int []i:times){
            ll.get(i[0]).add(new int[]{i[1],i[2]});
        }
        PriorityQueue<int[]>pq=new PriorityQueue<>((a,b)->a[1]-b[1]);
        pq.add(new int []{k,0});
        int []dist=new int[n+1];
        Arrays.fill(dist,Integer.MAX_VALUE);
        int max=0;
        while(!pq.isEmpty()){
            int[] q=pq.poll();
            int node=q[0];
            int dis=q[1];
            for(int []i:ll.get(node)){
                if(dis+i[1]<dist[i[0]]){
                    dist[i[0]]=i[1]+dis;
                    pq.add(new int[]{i[0],dist[i[0]]});
                }
            }
        }
        for(int i=1;i<n+1;i++) {
            if(i==k) continue;
            max=Math.max(dist[i],max);
            if(dist[i]==Integer.MAX_VALUE) return -1;
        }
        return max;
    }
}