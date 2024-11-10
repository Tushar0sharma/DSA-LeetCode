class Solution {
    public int nthUglyNumber(int n) {
        PriorityQueue<Long>pq=new PriorityQueue<>();
        Set<Long>s=new HashSet<>();
        int []prime={2,3,5};
        pq.add(1L);
        long ans=1;
        for(int i=0;i<n;i++){
            long v=pq.poll();
            ans=v;
            for(int j:prime){
                long k=j*v;
                if(s.add(k)){
                    pq.add(k);
                }
            }
        }
        return (int)ans;    
    }
}