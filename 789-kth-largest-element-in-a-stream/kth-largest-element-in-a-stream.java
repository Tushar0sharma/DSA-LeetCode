class KthLargest {
    final int v;
    final PriorityQueue<Integer>pq;
    public KthLargest(int k, int[] nums) {
        pq=new PriorityQueue<>(k);
        v=k;
        for(int i:nums) add(i);
    }
    
    public int add(int val) {
        pq.add(val);
        if(pq.size()>v) pq.poll();
        return pq.peek();
    }
}

/**
 * Your KthLargest object will be instantiated and called as such:
 * KthLargest obj = new KthLargest(k, nums);
 * int param_1 = obj.add(val);
 */