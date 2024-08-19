class Solution {
    public boolean canPartition(int[] nums) {
        int sum=0;
        for(int i:nums) sum+=i;
        int reqSum=sum/2;
        int n=nums.length;
        if(sum%2!=0) return false;
        boolean[]dp=new boolean [reqSum+1];
        dp[0]=true;
        if(nums[0]<=reqSum) dp[nums[0]]=true;
        for(int i=1;i<n;i++){
            boolean []dp1=new boolean [reqSum+1];
            dp1[0]=true;
            for(int j=1;j<=reqSum;j++){
                boolean nottake=dp[j];
                boolean take=false;
                if(nums[i]<=j) take=dp[j-nums[i]];
                dp1[j]=take||nottake;
            }
            dp=dp1;
        }
        return dp[reqSum];
    }
}