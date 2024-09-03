class Solution {
    public int maxProfit(int[] p) {
        int n=p.length;
        int [][]dp=new int[n+1][2];
        // for(int []i:dp) Arrays.fill(i,-1);
        // return call(prices,0,1,dp);
        dp[n][0]=dp[n][1]=0;
        for(int i=n-1;i>=0;i--){
            for(int j=0;j<2;j++){
                if(j==1){
                     dp[i][j]=Math.max(-p[i]+dp[i+1][0],dp[i+1][1]);
                }
                else {
                     dp[i][j]=Math.max(p[i]+dp[i+1][1],dp[i+1][0]);
                }
            }
        }
        return dp[0][1];
    }
    // public int call(int []p,int i,int j,int [][]dp){
    //     if(i==p.length){
    //         return 0;
    //     }
    //     if(dp[i][j]!=-1) return dp[i][j];
    //     if(j==1){
    //         return dp[i][j]=Math.max(-p[i]+call(p,i+1,0,dp),call(p,i+1,1,dp));
    //     }
    //     else {
    //         return dp[i][j]=Math.max(p[i]+call(p,i+1,1,dp),call(p,i+1,0,dp));
    //     }
    // }
}