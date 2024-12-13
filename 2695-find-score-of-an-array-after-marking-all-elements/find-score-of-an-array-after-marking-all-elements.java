class Solution {
    public long findScore(int[] nums) {
        long ans=0;
        PriorityQueue<int[]>pq=new PriorityQueue<>((a,b)->(a[0]==b[0])?a[1]-b[1]:a[0]-b[0]);
        for(int i=0;i<nums.length;i++){
            pq.add(new int[]{nums[i],i});
        }
        Set<Integer>s=new HashSet<>();
        while(s.size()<nums.length){
            int []a=pq.poll();
            int i=a[1];
            if(s.contains(i)) continue;
            ans+=a[0];
            s.add(i);
            if(i+1<nums.length) s.add(i+1);
            if(i-1>=0) s.add(i-1);
        }
        return ans;
    }
}