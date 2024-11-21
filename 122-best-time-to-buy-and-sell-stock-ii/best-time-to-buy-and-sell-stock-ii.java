class Solution {
    public int maxProfit(int[] prices) {
        int[][]dp=new int[prices.length][2];
        for(int []i:dp) Arrays.fill(i,-1);
        return call(0,1,prices,dp);
    }
    public int call(int i,int buy,int []prices,int [][]dp){
        if(i==prices.length) return 0;
        if(dp[i][buy]!=-1) return dp[i][buy];
        int profit=0;
        if(buy==0){
            profit=Math.max(prices[i]+call(i+1,1,prices,dp),call(i+1,0,prices,dp));
        }
        else{
            profit=Math.max(-prices[i]+call(i+1,0,prices,dp),call(i+1,1,prices,dp));
        }
        return dp[i][buy]=profit;
    }
}