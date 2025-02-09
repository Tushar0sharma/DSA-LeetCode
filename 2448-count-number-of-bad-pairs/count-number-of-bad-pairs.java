class Solution {
    public long countBadPairs(int[] nums) {
        Map<Integer,Integer>mp=new HashMap<>();
        int n=nums.length;
        long cnt=0;
        for(int i=0;i<n;i++){
            int prev=mp.getOrDefault(i-nums[i],0);
            cnt+=prev;
            mp.put(i-nums[i],prev+1);
        }
        return (long)n*(n-1)/2-cnt;
    }
}