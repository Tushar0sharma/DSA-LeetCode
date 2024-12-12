class Solution {
    public long pickGifts(int[] gifts, int k) {
        long ans=0;
        PriorityQueue<Integer>pq=new PriorityQueue<>(Collections.reverseOrder());
        for(int i:gifts) pq.add(i);
        while(k-->0){
            int a=(int)Math.sqrt(pq.poll());
            pq.add(a);
        }
        while(!pq.isEmpty()) ans+=pq.poll();
        return ans;
    }
}