class Solution {
    public int halveArray(int[] nums) {
        PriorityQueue<Double>pq=new PriorityQueue<>(Collections.reverseOrder());
        double sum=0;
        for(int i:nums) {
            pq.add((double)i);
            sum+=i;
        }
        double half=sum/2;
        int k=0;
        while(sum>half){
            double a=pq.poll();
            sum-=a/2;
            pq.add(a/2);
            k++;
        }
        return k;
    }
}