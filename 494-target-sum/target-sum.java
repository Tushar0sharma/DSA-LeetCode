class Solution {
    public int findTargetSumWays(int[] nums, int target) {
        int n=nums.length;
        int sum=0;
        for(int i:nums) sum+=i;
        if((sum-target)%2!=0  || sum-target<0) return 0;
        return cal(nums,(sum-target)/2,n);
    }
    public int cal(int []nums,int t,int n){
        int [][]dp=new int[n][t+1];
        for(int i=0;i<n;i++) dp[i][0]=1;
        if(nums[0]==0) dp[0][0]=2;
        else dp[0][0]=1;
        if(nums[0]!=0 && nums[0]<=t) dp[0][nums[0]]=1;
        for(int i=1;i<n;i++){
            for(int j=0;j<=t;j++){
                int nt=dp[i-1][j];
                int tt=0;
                if(j>=nums[i]) tt=dp[i-1][j-nums[i]];
                dp[i][j]=tt+nt;
            }
        }
        return dp[n-1][t];
    }
}