class Solution {
    public int numTrees(int n) {
        int []dp=new int[n+1];
        Arrays.fill(dp,-1);
        return call(n,dp);
    }
    public int call(int i,int []dp){
        if(i<=1) return 1;
        if(dp[i]!=-1) return dp[i];
        int ans=0;
        for(int j=1;j<=i;j++){
            ans+=call(j-1,dp)*call(i-j,dp);
        }
        return dp[i]=ans;
    }
}