class Solution {
    public int furthestBuilding(int[] h, int bricks, int ladders) {
        PriorityQueue<Integer>pq=new PriorityQueue<>(Collections.reverseOrder());
        int n=h.length;
        for(int i=0;i<n-1;i++){
            if(h[i]>=h[i+1]) continue;
            bricks-=h[i+1]-h[i];
            pq.add(h[i+1]-h[i]);
            if(bricks<0){
                bricks+=pq.poll();
                if(ladders>0) ladders--;
                else return i;
            }
        }
        return n-1;
    }
}