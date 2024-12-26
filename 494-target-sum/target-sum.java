class Solution {
    public int findTargetSumWays(int[] nums, int target) {
        int offset=0;
        for(int i:nums) offset+=i;
        int [][]dp=new int[nums.length+1][2*offset+1];
        for(int i[]:dp) Arrays.fill(i,-1);
        return call(0,target,0,nums,dp,offset);
    }
    public int call(int i,int t,int sum,int []nums,int [][]dp,int a){
        if(i==nums.length){
            if(t==sum) return 1;
            else return 0;
        } 
        if(dp[i][a+sum]!=-1) return dp[i][a+sum];
        int ans=0;
        ans+=call(i+1,t,sum-nums[i],nums,dp,a);
        ans+=call(i+1,t,sum+nums[i],nums,dp,a);
        return dp[i][sum+a]= ans;
    }
}