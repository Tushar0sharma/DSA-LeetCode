class Solution {
    public int maxProfit(int[] p) {
        int n=p.length;
        int [][]dp=new int[n+2][2];
        // for(int []i:dp) Arrays.fill(i,-1);
        // return call(0,1,p,dp);
        for(int i=n-1;i>=0;i--){
            dp[i][1]=Math.max(-p[i]+dp[i+1][0],dp[i+1][1]);
            dp[i][0]=Math.max(p[i]+dp[i+2][1],dp[i+1][0]);            
        }
        return dp[0][1];
    }
    // public int call(int i,int j,int[]p,int [][]dp){
    //     if(i>=p.length) return 0;
    //     if(dp[i][j]!=-1) return dp[i][j];
    //     if(j==1){
    //         return dp[i][j]=Math.max(-p[i]+call(i+1,0,p,dp),call(i+1,1,p,dp));
    //     }
    //     else{
    //         return dp[i][j]=Math.max(p[i]+call(i+2,1,p,dp),call(i+1,0,p,dp));
    //     }
    // }
}