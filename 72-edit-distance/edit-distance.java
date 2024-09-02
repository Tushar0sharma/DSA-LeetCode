class Solution {
    public int minDistance(String s, String t) {
        int n=s.length();
        int m=t.length();
        int [][]dp=new int[n][m];
        for(int []i:dp) Arrays.fill(i,-1);
        return call(s,t,dp,n-1,m-1);
    }
    public int call(String s,String t,int [][]dp,int i,int j){
        if(i<0 && j<0) return 0;
        if(i<0 ) return j+1;
        if(j<0) return i+1;
        if(dp[i][j]!=-1) return dp[i][j];
        if(s.charAt(i)==t.charAt(j)) return dp[i][j]= call(s,t,dp,i-1,j-1);
        int insert=1+call(s,t,dp,i,j-1);
        int replace=1+call(s,t,dp,i-1,j-1);
        int delete=1+call(s,t,dp,i-1,j);
        int min=Math.min(insert,delete);
        return dp[i][j]=Math.min(min,replace);
    }
}