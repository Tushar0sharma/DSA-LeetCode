class Solution {
    public int numDistinct(String s, String t) {
        int n=s.length();
        int m=t.length();
        int [][]dp=new int[n][m];
        for(int[] i:dp) Arrays.fill(i,-1);
        return call(n-1,m-1,dp,s,t);
    }
    public int call(int i,int j,int [][]dp,String s,String t){
        if(j<0) return 1;
        if(i<0) return 0;
        if(dp[i][j]!=-1) return dp[i][j];
        if(s.charAt(i)==t.charAt(j)) return dp[i][j]=call(i-1,j-1,dp,s,t)+call(i-1,j,dp,s,t);
        else return dp[i][j]=call(i-1,j,dp,s,t);
    }
}