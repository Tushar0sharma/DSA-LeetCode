class Solution {
    public int coinChange(int[] arr, int tar) {
        int n=arr.length;
        int [][]dp=new int[n][tar+1];
        dp[0][0]=0;
        for(int i=1;i<=tar;i++){
            if(i%arr[0]==0) dp[0][i]=i/arr[0];
            else dp[0][i]=(int )1e9;
        }
        for(int i=1;i<n;i++){
            for(int j=0;j<=tar;j++){
                int nottake=dp[i-1][j];
                int take=(int)1e9;
                if(j>=arr[i]) take=1+dp[i][j-arr[i]];
                dp[i][j]=Math.min(take,nottake);
            }
        }
        return dp[n-1][tar]==(int)1e9?-1:dp[n-1][tar];
    }
}