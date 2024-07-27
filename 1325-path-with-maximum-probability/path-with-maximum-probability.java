class p{
    double poss;
    int node;
    p(int node,double poss){
        this.node=node;
        this.poss=poss;
    }
}
class Solution {
    public double maxProbability(int n, int[][] edges, double[] succProb, int start_node, int end_node) {
        List<List<p>>ll=new ArrayList<>();
        int k=0;
        for(int i=0;i<n;i++) ll.add(new ArrayList<>());
        for(int i[]:edges){
            ll.get(i[0]).add(new p(i[1],succProb[k]));
            ll.get(i[1]).add(new p(i[0],succProb[k]));
            k++;
        }
        PriorityQueue<p>pq=new PriorityQueue<>((a,b)->Double.compare(b.poss,a.poss));
        pq.add(new p(start_node,1));
        double[]dist=new double[n];
        Arrays.fill(dist,Double.MIN_VALUE);
        dist[start_node]=0;
        while(!pq.isEmpty()){
            p w=pq.poll();
            int node=w.node;
            double poss=w.poss;

            if (node == end_node) return poss; 
            for(p i:ll.get(node)){
                int adjnode=i.node;
                double adjposs=i.poss;
                if(adjposs*poss>dist[adjnode]){
                    dist[adjnode]=adjposs*poss;
                    pq.add(new p(adjnode,dist[adjnode]));
                } 
            }
        }
        return dist[end_node];
    }
}