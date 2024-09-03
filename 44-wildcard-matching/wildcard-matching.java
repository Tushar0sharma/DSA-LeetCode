class Solution {
    public boolean isMatch(String s, String p) {
        int n=s.length();
        int m=p.length();
        Boolean [][]dp=new Boolean[n+1][m+1];
        return call(n,m,s,p,dp);
    }
    public boolean  call(int i,int j,String s,String t,Boolean [][]dp){
        if(i==0 && j==0) return true;
        if(i==0 && j>0) {
            for(int k=1;k<=j;k++){
                if(t.charAt(k-1)!='*') return false;
            }
            return true;
        }
        if(j==0 && i>0) return false;
        if (dp[i][j] != null) return dp[i][j];

        if(s.charAt(i-1)==t.charAt(j-1) || t.charAt(j-1)=='?'){
            return dp[i][j]= call(i-1,j-1,s,t,dp);
        }
        else if(t.charAt(j-1)=='*'){
            return dp[i][j] =call(i-1,j,s,t,dp)||call(i,j-1,s,t,dp);
        }
        return false;
    }
}