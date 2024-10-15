class Solution {
    public int nthUglyNumber(int n) {
        PriorityQueue<Long>pq=new PriorityQueue<>();
        pq.add(1L);
        Set<Long>s=new HashSet<>();
        long ans=0;
        int []prime={2,3,5};
        for(int i=0;i<n;i++){
            long val=pq.poll();
            ans=val;
            for(int k:prime){
                long a=val*k;
                if(s.add(a))
                pq.add(a);
            }
        }
        return (int)ans;
    }
}