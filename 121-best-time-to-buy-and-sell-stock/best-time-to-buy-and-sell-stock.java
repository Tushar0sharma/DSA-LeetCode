class Solution {
    public int maxProfit(int[] prices) {
        int min=Integer.MAX_VALUE;
        int profit=0;
        for(int num:prices){
            if(num<min) min=num;
            if(num-min>profit){
                profit=num-min;
            }
        }
        return profit;
    }
}