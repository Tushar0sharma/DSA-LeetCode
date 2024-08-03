class Solution {
    public int uniquePaths(int m, int n) {
        int [][]dp=new int[m][n];
        // for(int []i:dp) Arrays.fill(i,-1);
        // return f(dp,m-1,n-1);
        dp[0][0]=1;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(i-1>=0) dp[i][j]=dp[i-1][j];
                if(j-1>=0) dp[i][j]+=dp[i][j-1];
            }
        }
        return dp[m-1][n-1];
    }

    public int f(int [][]dp,int m,int n){
        if(m==0 && n==0){
            return dp[m][n]=1;
        }
        if(n<0 || m<0) return 0;
        if(dp[m][n]!=-1) return dp[m][n];
        dp[m][n]=f(dp,m-1,n);
        dp[m][n]+=f(dp,m,n-1);
        return dp[m][n];
    }
}