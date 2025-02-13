class Solution {
    public int minOperations(int[] nums, int k) {
        int ans=0;
        PriorityQueue<Long>pq=new PriorityQueue<>();
        for(int i:nums) pq.add((long)i);
        while(!pq.isEmpty() && pq.peek()<k){
            long a=pq.poll();
            long b=pq.poll();
            long kk=Math.min(a,b)*2+Math.max(a,b);
            pq.add(kk);
            ans++;
        }
        return ans;
    }
}