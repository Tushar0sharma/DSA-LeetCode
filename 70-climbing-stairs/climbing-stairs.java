class Solution {
    public int climbStairs(int n) {
        if(n==1 || n==2) return n;
        // int []dp=new int[n+1];
        // Arrays.fill(dp,-1);
        // dp[0]=0;
        // dp[1]=1;
        // dp[2]=2;
        // for(int i=3;i<=n;i++){
        //     dp[i]=dp[i-1]+dp[i-2];
        // }
        // return dp[n];
        int a=1;
        int b=2;
        int c=0;
        for(int i=3;i<=n;i++) {c=b+a;a=b;b=c;}
        return c;

    }
    public int call(int n,int []dp){
        if(n<0) return 0;
        if(n==0) return 1;
        if(dp[n]!=-1)return dp[n];
        return dp[n]=call(n-1,dp)+call(n-2,dp);
    }
}