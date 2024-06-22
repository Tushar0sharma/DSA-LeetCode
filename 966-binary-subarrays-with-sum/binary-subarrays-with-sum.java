class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
        int pre[]=new int[nums.length+1];
        int presum=0;
        pre[0]=1;
        int res=0;
        for(int i:nums){
            presum+=i;
            if(goal<=presum){
                res+=pre[presum-goal];
            }
            pre[presum]++;
        }
        return res;
    }
}