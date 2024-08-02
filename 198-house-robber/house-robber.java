class Solution {
    public int rob(int[] nums) {
        int n=nums.length;
        if(n==0) return 0;
        int prev1=0;
        int prev2=0;
        for(int i:nums){
            int t=prev1;
            prev1=Math.max(prev1,prev2+i);
            prev2=t;
        }
        return prev1;
    }
}