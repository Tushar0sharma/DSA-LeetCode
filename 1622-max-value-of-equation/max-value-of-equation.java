class Solution {
    public int findMaxValueOfEquation(int[][] points, int k) {
        PriorityQueue<Pair<Integer,Integer>>pq=new PriorityQueue<>((a,b)->(a.getKey()==b.getKey() ? a.getValue()-b.getValue() : b.getKey()-a.getKey()));
        int ans=Integer.MIN_VALUE;
        for(int []p:points){
            while(!pq.isEmpty() && p[0]-pq.peek().getValue()>k) pq.poll();
            if(!pq.isEmpty()) ans=Math.max(ans,pq.peek().getKey()+p[0]+p[1]);
            pq.add(new Pair<>(p[1]-p[0],p[0]));
        }
        return ans;
    }
}