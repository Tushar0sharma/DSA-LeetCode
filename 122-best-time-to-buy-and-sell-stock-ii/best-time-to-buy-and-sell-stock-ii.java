class Solution {
    public int maxProfit(int[] prices) {
        int i=0,profit=0,sell,buy,n=prices.length;
        while(i<n){
            while(i<n-1 && prices[i]>=prices[i+1]) i++;
            buy=prices[i];

            while(i<n-1 && prices[i]<=prices[i+1]) i++;
            sell=prices[i];
            i++;
            profit+=sell-buy;
        }
        return profit;
    }
}