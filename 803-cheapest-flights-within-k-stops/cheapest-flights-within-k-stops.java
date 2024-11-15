class Solution {
    public int findCheapestPrice(int n, int[][] flights, int src, int dst, int k) {
        int m=flights.length;
        List<List<int[]>>ll=new ArrayList<>();
        Queue<int[]>q=new LinkedList<>();
        q.add(new int[]{src,0,0});
        int []dist=new int[n];
        Arrays.fill(dist,Integer.MAX_VALUE);
        dist[src]=0;
        for(int i=0;i<n;i++){
            ll.add(new ArrayList<>());
        }
        for(int[] i:flights){
            ll.get(i[0]).add(new int[]{i[1],i[2]});
        }
        while(!q.isEmpty()){
            int []p=q.poll();
            int node=p[0];
            int cost=p[1];
            int stop=p[2];
            if(stop>k) continue;
            for(int i[]:ll.get(node)){
                int nt=i[1]+cost;
                if(dist[i[0]]>nt){
                    dist[i[0]]=nt;
                    q.add(new int[]{i[0],nt,stop+1});
                }
            }
        }
        return dist[dst]==Integer.MAX_VALUE?-1:dist[dst];
    }
}