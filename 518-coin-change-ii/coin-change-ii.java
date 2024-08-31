class Solution {
    public int change(int t, int[] arr) {
        int n=arr.length;
        int [][]dp=new int[n][t+1];
        // for(int []i:dp) Arrays.fill(i,-1);
        for(int i=0;i<=t;i++){
            dp[0][i]=(i%arr[0]==0)?1:0;
        }
        for(int i=1;i<n;i++){
            for(int j=0;j<=t;j++){
                int nt=dp[i-1][j];
                int ta=0;
                if(arr[i]<=j) ta=dp[i][j-arr[i]];  
                dp[i][j]=nt+ta;
            }
        }
        return dp[n-1][t];
    }
}