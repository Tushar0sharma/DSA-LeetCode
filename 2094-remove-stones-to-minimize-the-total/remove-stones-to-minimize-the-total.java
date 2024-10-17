class Solution {
    public int minStoneSum(int[] piles, int k) {
        PriorityQueue<Integer>pq=new PriorityQueue<>(Collections.reverseOrder());
        for(int i:piles) pq.add(i);
        while(k>0){
            int q=pq.poll();
            pq.add(q-q/2);
            k--;
        }
        int sum=0;
        while(!pq.isEmpty()) sum+=pq.poll();
        return sum;
    }
}