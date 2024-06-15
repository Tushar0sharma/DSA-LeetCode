class Solution {
    public long maxScore(int[] nums1, int[] nums2, int k) {
        int n=nums1.length;
        int [][]ess=new int[n][2];
        for(int i=0;i<n;i++){
            ess[i][0]=nums2[i];
            ess[i][1]=nums1[i];
        }
        Arrays.sort(ess,(a,b)->b[0]-a[0]);
        long res=0,sum=0;
        PriorityQueue<Integer>pq=new PriorityQueue<>(k, (a,b)->a-b);
        for(int[] es:ess){
            pq.offer(es[1]);
            sum+=es[1];
            if(pq.size()>k) sum-=pq.poll();
            if(pq.size()==k) res=Math.max(res,(sum*es[0]));
        }
        return res;
    }
}