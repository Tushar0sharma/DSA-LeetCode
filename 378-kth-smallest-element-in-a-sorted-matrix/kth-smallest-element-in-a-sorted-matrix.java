class Solution {
    public int kthSmallest(int[][] matrix, int k) {
        PriorityQueue<Integer>pq=new PriorityQueue<>();
        for(int[]i:matrix){
            for(int j:i) pq.add(j);
        }
        while(k-->1){
            pq.poll();
        }
        return pq.poll();
    }
}