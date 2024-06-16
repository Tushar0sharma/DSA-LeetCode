class Solution {
    public int maxProfit(int[] prices) {
        int profit=0;
        int min=Integer.MAX_VALUE;
        for(int num:prices){
            if(num<min) min=num;
            if(num-min>profit){
                profit=num-min;
            }
        }
        return profit;
    }
}