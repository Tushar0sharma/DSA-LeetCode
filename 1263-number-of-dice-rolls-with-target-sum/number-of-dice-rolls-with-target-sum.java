class Solution {
    int d=-1;
    int mod=1_000_000_007;
    public int numRollsToTarget(int n, int k, int target) {
        d=k;
        int [][]dp=new int[n+1][target+1];
        for(int []i:dp) Arrays.fill(i,-1);
        return call(dp,n,target);
    }
    public int call(int [][]dp,int i,int j){
        if(i==0 && j==0) return 1;
        if(j==0 || i==0) return 0;
        if(dp[i][j]!=-1) return dp[i][j];
        dp[i][j]=0;
        for(int s=1;s<=d;s++){
            if(j>=s)  dp[i][j]=(dp[i][j]+call(dp,i-1,j-s))%mod;
            else break;
        }
        return (int)dp[i][j];
    }
}