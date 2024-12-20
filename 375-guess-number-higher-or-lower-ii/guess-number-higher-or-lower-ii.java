class Solution {
    public int getMoneyAmount(int n) {
        int [][]dp=new int[n+1][n+1];
        for(int []i:dp) Arrays.fill(i,-1);
        return call(1,n,dp);
    }
    public int call(int l,int r,int [][]dp){
        if(l>=r) return 0;
        if(dp[l][r]!=-1) return dp[l][r];
        int res=Integer.MAX_VALUE;
        for(int i=l;i<=r;i++){
            int temp=i+Math.max(call(l,i-1,dp),call(i+1,r,dp));
            res=Math.min(temp,res);
        }
        return dp[l][r]=res;
    }
}