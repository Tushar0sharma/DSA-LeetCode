class Solution {
    public int maxProfit(int[] p) {
        int n=p.length;
        int [][]dp=new int[n][4];
        for(int []i:dp) Arrays.fill(i,-1);
        return call(dp,0,0,p);
    }
    public int call(int [][]dp,int i,int t,int []p){
        if(i==p.length || t==4) return 0;
        if(dp[i][t]!=-1) return dp[i][t];
        if(t%2==0){
            return dp[i][t]=Math.max(-p[i]+call(dp,i+1,t+1,p),call(dp,i+1,t,p));
        }
        else{
            return dp[i][t]=Math.max(p[i]+call(dp,i+1,t+1,p),call(dp,i+1,t,p));
        }
    }
}