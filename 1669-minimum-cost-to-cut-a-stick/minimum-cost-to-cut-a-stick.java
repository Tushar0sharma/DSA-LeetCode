class Solution {
    int [][]dp;
    public int minCost(int n, int[] cuts) {
        int m=cuts.length+2;
        int []cut=new int [m];
        dp=new int[m+2][m+2];
        for(int []i:dp) Arrays.fill(i,-1);
        for(int i=0;i<m;i++){
            if(i==0) cut[i]=i;
            else if(i==m-1) cut[i]=n;
            else cut[i]=cuts[i-1];
        }
        Arrays.sort(cut);
        return call(0,m-1,cut);
    }
    public int call(int i,int j,int []cuts){
        if(j-i<2) return 0;
        if(dp[i][j]!=-1) return dp[i][j];
        
        int res=Integer.MAX_VALUE;
        for(int k=i+1;k<=j-1;k++){
            res=Math.min(res,(cuts[j]-cuts[i])+call(i,k,cuts)+call(k,j,cuts));
        }
        return dp[i][j]=res;
    }
}