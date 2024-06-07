class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer,Integer>mp=new HashMap<>();
        for(int num:nums){
            mp.put(num,mp.getOrDefault(num,0)+1);
        }
        int []ans=new int[k];
        PriorityQueue<Integer>pq=new PriorityQueue<>((a,b) -> mp.get(b)-mp.get(a));

        for(int key:mp.keySet()){
            pq.add(key);
        }

        for(int i=0;i<k;i++){
            ans[i]=pq.poll();
        }
        return ans;
    }
}