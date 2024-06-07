class Solution {
    public int maxProfit(int[] prices) {
        int i=0,n=prices.length-1,buy,sell,profit=0;
        while(i<n){
            while(i<n && prices[i]>=prices[i+1]) i++;
            buy=prices[i];

            while(i<n && prices[i]<prices[i+1]) i++;
            sell=prices[i];

            profit+=sell-buy;
        }
        return profit;
    }
}