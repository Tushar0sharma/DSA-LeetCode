class Solution {
    public int minInsertions(String s) {
        int n=s.length();
        int lcs=call(s,rev(s));
        return n-lcs;
    }
    public int call(String s,String t){
        int n=s.length();
        int m=t.length();
        int [][]dp=new int[n+1][m+1];
        for(int i=1;i<=n;i++){
            for(int j=1;j<=m;j++){
                if(s.charAt(i-1)==t.charAt(j-1)) dp[i][j]=1+dp[i-1][j-1];
                else dp[i][j]=Math.max(dp[i-1][j],dp[i][j-1]);
            }
        }
        return dp[n][m];
    }
    public String rev(String s){
        String ans="";
        for(int i=0;i<s.length();i++) ans=s.charAt(i)+ans;
        return ans;
    }
}