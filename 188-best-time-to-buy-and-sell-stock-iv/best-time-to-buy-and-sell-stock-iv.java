class Solution {
    public int maxProfit(int k, int[] p) {
        int n=p.length;
        int [][][]dp=new int[n+1][2][k+1];
        for(int [][]i:dp) for(int []j:i) Arrays.fill(j,-1);
        return call(dp,0,1,k,p);
    }
    public int call(int [][][]dp,int i,int j,int k,int []p){
        if(i==p.length) return 0;
        if(k==0) return 0;
        if(dp[i][j][k]!=-1) return dp[i][j][k];
        if(j==1){
            return dp[i][j][k]=Math.max(-p[i]+call(dp,i+1,0,k,p),call(dp,i+1,1,k,p));
        }
        else{
            return dp[i][j][k]=Math.max(p[i]+call(dp,i+1,1,k-1,p),call(dp,i+1,0,k,p));
        }
    }
}