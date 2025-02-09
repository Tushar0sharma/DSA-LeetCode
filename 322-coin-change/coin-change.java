class Solution {
    public int coinChange(int[] coins, int amount) {
        int max=amount +1;
        int []dp=new int[max];
        Arrays.fill(dp,max);
        dp[0]=0;
        for(int i=1;i<=amount;i++){
            for(int j:coins){
                if(i>=j) dp[i]=Math.min(dp[i],dp[i-j]+1);
            }
        }
        return dp[amount]>amount?-1:dp[amount];
    }
}