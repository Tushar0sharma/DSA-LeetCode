class Solution {
    // public int maxProfit(int k, int[] p) {
    //     int n=p.length;
    //     // int [][][]dp=new int[n+1][2][k+1];
    //     // for(int [][]i:dp) for(int []j:i) Arrays.fill(j,-1);
    //     // return call(dp,0,1,k,p);
    //     int [][]dp=new int [n][2*k+1];
    //     for(int []i:dp) Arrays.fill(i,-1);
    //     return call(0,0,dp,p,2*k);
    // }
    // public int call(int i,int j,int [][]dp,int []p,int k){
    //     if(i==p.length || j==2*k) return 0;
    //     if(dp[i][j]!=-1) return dp[i][j];
    //     if(j%2==0){
    //         return dp[i][j]=Math.max(-p[i]+call(i+1,j+1,dp,p,k),call(i+1,j,dp,p,k));
    //     }
    //     else{
    //         return dp[i][j]=Math.max(p[i]+call(i+1,j+1,dp,p,k),call(i+1,j,dp,p,k));
    //     }
    // }
    // // public int call(int [][][]dp,int i,int j,int k,int []p){
    // //     if(i==p.length) return 0;
    // //     if(k==0) return 0;
    // //     if(dp[i][j][k]!=-1) return dp[i][j][k];
    // //     if(j==1){
    // //         return dp[i][j][k]=Math.max(-p[i]+call(dp,i+1,0,k,p),call(dp,i+1,1,k,p));
    // //     }
    // //     else{
    // //         return dp[i][j][k]=Math.max(p[i]+call(dp,i+1,1,k-1,p),call(dp,i+1,0,k,p));
    // //     }
    // // }
    public int maxProfit(int k, int[] p) {
        int n = p.length;
        if (n == 0) return 0;

        // // Handle the special case where k is very large
        // if (k >= n / 2) {
        //     return maxProfitUnlimited(p);
        // }

        int[][] dp = new int[n][2 * k + 1];
        for (int[] row : dp) {
            Arrays.fill(row, Integer.MIN_VALUE);
        }
        return call(0, 0, dp, p, k);
    }

    public int call(int i, int j, int[][] dp, int[] p, int k) {
        if (i == p.length || j == 2 * k) return 0;
        if (dp[i][j] != Integer.MIN_VALUE) return dp[i][j];

        if (j % 2 == 0) {  // Buying
            dp[i][j] = Math.max(-p[i] + call(i + 1, j + 1, dp, p, k), call(i + 1, j, dp, p, k));
        } else {           // Selling
            dp[i][j] = Math.max(p[i] + call(i + 1, j + 1, dp, p, k), call(i + 1, j, dp, p, k));
        }
        return dp[i][j];
    }
}