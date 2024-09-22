class Solution {
    public int fib(int n) {
        int []dp=new int[n+1];
        return call(n,dp);
    }
    public int call(int n,int []dp){
        if(n==0 ) return 0;
        if(n==1 ) return 1;
        
        if(dp[n]!=0) return dp[n];
        return dp[n]=call(n-1,dp)+call(n-2,dp);
    }
}