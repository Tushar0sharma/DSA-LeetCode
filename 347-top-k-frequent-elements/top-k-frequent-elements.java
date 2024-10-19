class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer,Integer>mp=new HashMap<>();
        for(int i:nums) mp.put(i,mp.getOrDefault(i,0)+1);
        PriorityQueue<int []>pq=new PriorityQueue<>((a,b)->b[1]-a[1]);
        for(int i:mp.keySet()) pq.add(new int[]{i,mp.get(i)});
        int []ans=new int[k];
        for(int i=0;i<k;i++) ans[i]=pq.poll()[0];
        return ans;
    }
}