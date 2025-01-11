class Solution {
    public int rob(int[] nums) {
        int n=nums.length;
        int []dp=new int[n];
        Arrays.fill(dp,-1);
        return call(dp,n,nums,0);
    }
    public int call(int[]dp,int n,int []nums,int i){
        if(i==n-1) return nums[n-1];
        if(i>=n) return 0;
        if(dp[i]!=-1) return dp[i];
        int take=0,nottake=0;
        take=call(dp,n,nums,i+2)+nums[i];
        nottake=call(dp,n,nums,i+1);
        return dp[i]=Math.max(take,nottake);
    }
}