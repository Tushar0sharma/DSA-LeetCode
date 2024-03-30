class Solution {
    public long maxKelements(int[] nums, int k) {
        long sum=0;
        int n=nums.length;
        PriorityQueue<Integer>pq=new PriorityQueue<>(Collections.reverseOrder());
        for(int i:nums) pq.add(i);
        while(k-->0){
            int num=pq.remove();
            sum+=num;
            pq.add((int)Math.ceil(num/3.0));
        }
        return sum;
    }
}