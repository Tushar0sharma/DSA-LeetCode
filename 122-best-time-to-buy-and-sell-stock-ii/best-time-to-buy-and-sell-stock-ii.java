class Solution {
    public int maxProfit(int[] prices) {
        int []ahead=new int[2];
        int n=prices.length;
        for(int i=n-1;i>=0;i--){
            for(int j=0;j<=1;j++){
                int profit=0;
                if(j==0) profit=Math.max(prices[i]+ahead[1],ahead[0]);
                else profit=Math.max(-prices[i]+ahead[0],ahead[1]);
                ahead[j]=profit;
            }
        }
        return ahead[1];
    }
}