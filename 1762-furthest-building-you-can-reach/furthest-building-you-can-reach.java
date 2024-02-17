class Solution {
    public int furthestBuilding(int[] height, int bricks, int ladders) {
        PriorityQueue<Integer> pq=new PriorityQueue<>(Collections.reverseOrder());
        for(int i=0;i<height.length-1;i++){
            if(height[i]>=height[i+1]) continue;
            bricks-=height[i+1]-height[i];
            pq.add(height[i+1]-height[i]);

            if(bricks<0){
                bricks+=pq.poll();
                if(ladders>0) ladders--;
                else return i;
            }
        }
      return height.length-1;  
        
    }
}