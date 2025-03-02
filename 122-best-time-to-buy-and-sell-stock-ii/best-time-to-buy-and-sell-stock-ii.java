class Solution {
    public int maxProfit(int[] prices) {
        int n=prices.length;
        int [][]dp=new int[n][2];
        for(int i[]:dp) Arrays.fill(i,-1);
        return call(dp,0,0,prices);
    }
    public int call(int [][]dp,int i,int j,int[]p){
        if(i==p.length) return 0;
        if(dp[i][j]!=-1) return dp[i][j];

        if(j==0){
             dp[i][j]=Math.max(call(dp,i+1,j,p),-p[i]+call(dp,i+1,1,p));
        }
        else{
             dp[i][j]=Math.max(call(dp,i+1,j,p),p[i]+call(dp,i+1,0,p));
        }
        return dp[i][j];
    }
}