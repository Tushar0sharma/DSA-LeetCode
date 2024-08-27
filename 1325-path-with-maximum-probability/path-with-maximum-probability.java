class pair{
    int d;
    double dis;
    pair(int d,double dis){
        this.d=d;
        this.dis=dis;
    }
}
class Solution {
    public double maxProbability(int n, int[][] edges, double[] succProb, int src, int end_node) {
        List<List<pair>>ll=new ArrayList<>();
        for(int i=0;i<n;i++) ll.add(new ArrayList<>());
        for(int i=0;i<edges.length;i++){
            int a=edges[i][0];
            int b=edges[i][1];
            ll.get(a).add(new pair(b,succProb[i]));
            ll.get(b).add(new pair(a,succProb[i]));
        }
        PriorityQueue<pair>pq=new PriorityQueue<>((a,b)->Double.compare(b.dis,a.dis));
        pq.add(new pair(src,1));
        double[]dist=new double[n];
        Arrays.fill(dist,Double.MIN_VALUE);
        dist[src]=0;
        while(!pq.isEmpty()){
            pair p=pq.poll();
            int node=p.d;
            double prob=p.dis;
            if(node==end_node) return prob;
            for(pair i:ll.get(node)){
                int dest=i.d;
                double pr=i.dis;
                if(pr*prob>dist[dest]){
                    dist[dest]=pr*prob;
                    pq.add(new pair(dest,dist[dest]));
                }
            }
        }
        return 0;
    }
}