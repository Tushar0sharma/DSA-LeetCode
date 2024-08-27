class Solution {
    public int coinChange(int[] coins, int amount) {
        int n=coins.length;
        int [][]dp=new int[n][amount+1];
        int a= call(n-1,coins,dp,amount);
        if(a==(int)1e9) return -1;
        return a;
    }
    public int call(int i,int []arr,int [][]dp,int tar){
        if(i==0){
            if(tar==0) return 0;
            if(tar%arr[0]==0) return tar/arr[0];
            return (int)1e9;
        }
        if(dp[i][tar]!=0) return dp[i][tar];
        int nottake=call(i-1,arr,dp,tar);
        int take=(int)1e9;
        if(tar>=arr[i]) take=1+call(i,arr,dp,tar-arr[i]);
        return dp[i][tar]=Math.min(take,nottake);
    }
}