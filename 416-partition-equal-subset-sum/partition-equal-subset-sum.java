class Solution {
    public boolean canPartition(int[] nums) {
        int sum=0;
        for(int i:nums) sum+=i;
        int reqSum=sum/2;
        int n=nums.length;
        if(sum%2!=0) return false;
        Boolean [][]dp=new Boolean [n][reqSum+1];
        return call(dp,nums,n-1,reqSum);
    }
    public boolean call(Boolean [][]dp,int []nums,int n,int sum){
        if(sum==0) return true;
        if(n==0) return nums[0]==sum;
        if(dp[n][sum]!=null) return dp[n][sum];
        boolean nottake=call(dp,nums,n-1,sum);
        boolean take=false;
        if(nums[n]<=sum) take=call(dp,nums,n-1,sum-nums[n]);
        return dp[n][sum]=take||nottake;        
    }
}