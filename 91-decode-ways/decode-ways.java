class Solution {
    public int numDecodings(String s) {
        int []dp=new int [s.length()];
        return call(s,0,dp);        
    }
    public int call(String s,int i,int []dp){
        if(s.length()==i){
            return 1;
        }
        if(dp[i]!=0) return dp[i];
        if(s.charAt(i)=='0') return 0;
        int res=call(s,i+1,dp);
        if(i+1<s.length() && (s.charAt(i)=='1' ||(s.charAt(i)=='2' && s.charAt(i+1)<'7'))) res+=call(s,i+2,dp);
        return dp[i]=res;
    }
}