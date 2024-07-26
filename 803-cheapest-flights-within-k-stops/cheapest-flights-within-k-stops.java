class pair{
    int st;
    int stop;
    int dist;
    pair(int st,int dist,int stop){
        this.st=st;
        this.dist=dist;
        this.stop=stop;
    }
}
class Solution {
    public int findCheapestPrice(int n, int[][] flights, int src, int dst, int k) {
        PriorityQueue<pair>pq=new PriorityQueue<>((a,b)->a.dist-b.dist);
        List<List<int[]>>ll=new ArrayList<>();
        for(int i=0;i<n;i++) ll.add(new ArrayList<>());
        for(int []i:flights){
            ll.get(i[0]).add(new int[]{i[1],i[2]});
        }
        int [][]mindist=new int[n][k+2];
        for(int i=0;i<n;i++) Arrays.fill(mindist[i],Integer.MAX_VALUE);
        pq.add(new pair(src,0,0));
        while(!pq.isEmpty()){
            pair p=pq.poll();
            int node=p.st;
            int d=p.dist;
            int st=p.stop;
            if(node==dst ) return d;
            if(st>k) continue; 

            for(int[] i:ll.get(node)){
                int dest=i[0];
                int dist=i[1];
                if(d+dist<mindist[dest][st+1]){
                    mindist[dest][st+1]=d+dist;
                    pq.add(new pair(dest,d+dist,st+1));
                }
            }
        }
        return -1;
    }
}