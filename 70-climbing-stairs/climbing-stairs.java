class Solution {
    public int climbStairs(int n) {
        int []dp=new int[n+2];
        // return call(n,dp);
        dp[1]=1;
        for(int i=2;i<=n+1;i++){
            dp[i]=dp[i-1]+dp[i-2];
        }
        return dp[n+1];
    }
    // public int call(int n,int []dp){
    //     if(n==0) return 1;
    //     if(n<0) return 0;
    //     if(dp[n]!=0) return dp[n];
    //     return dp[n]=call(n-1,dp)+call(n-2,dp);
    // }
}