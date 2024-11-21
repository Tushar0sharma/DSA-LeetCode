class Solution {
    public int maxProfit(int k, int[] prices) {
        int [][]dp=new int[prices.length][k*2];
        for(int []i:dp) Arrays.fill(i,-1);
        return call(0,0,prices,k,dp);
    }
    public int call(int i,int j,int[]prices,int k,int[][]dp){
        if(i==prices.length || j==2*k) return 0;
        int profit=0;
        if(dp[i][j]!=-1) return dp[i][j];
        if(j%2==0){
            profit=Math.max(-prices[i]+call(i+1,j+1,prices,k,dp),call(i+1,j,prices,k,dp));
        }
        else{
            profit=Math.max(prices[i]+call(i+1,j+1,prices,k,dp),call(i+1,j,prices,k,dp));
        }
        return dp[i][j]=profit;
    }
}