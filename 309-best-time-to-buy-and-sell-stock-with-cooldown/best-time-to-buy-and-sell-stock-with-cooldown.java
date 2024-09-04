class Solution {
    public int maxProfit(int[] p) {
        int n=p.length;
        int [][]dp=new int[n][2];
        for(int []i:dp) Arrays.fill(i,-1);
        return call(0,1,p,dp);
    }
    public int call(int i,int j,int[]p,int [][]dp){
        if(i>=p.length) return 0;
        if(dp[i][j]!=-1) return dp[i][j];
        if(j==1){
            return dp[i][j]=Math.max(-p[i]+call(i+1,0,p,dp),call(i+1,1,p,dp));
        }
        else{
            return dp[i][j]=Math.max(p[i]+call(i+2,1,p,dp),call(i+1,0,p,dp));
        }
    }
}