class Solution {
    public boolean canJump(int[] nums) {
        int n=nums.length;
        // int []dp=new int[n];
        // dp[n-1]=true;
        int goal=n-1;
        for(int i=n-2;i>=0;i--){
            if(nums[i]+i>=goal)   goal=i;
        }
        return goal==0;
    }
}