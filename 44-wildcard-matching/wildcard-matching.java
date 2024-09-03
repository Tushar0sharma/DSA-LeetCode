class Solution {
    public boolean isMatch(String s, String t) {
        int n=s.length();
        int m=t.length();
        boolean [][]dp=new boolean[n+1][m+1];
        for(int i=1;i<=m;i++){
            boolean f=false;
            for(int k=1;k<=i;k++){
                 if(t.charAt(k-1)!='*'){
                    f=true;
                    dp[0][i]=false;
                 }
                 if(!f) dp[0][i]=true;
            }
        }
        dp[0][0]=true;

        for(int i=1;i<=n;i++){
            for(int j=1;j<=m;j++){
                if(s.charAt(i-1)==t.charAt(j-1) || t.charAt(j-1)=='?'){
                     dp[i][j]=dp[i-1][j-1];
                }
                else if(t.charAt(j-1)=='*'){
                    dp[i][j]=dp[i-1][j]||dp[i][j-1];
                }
                else{
                    dp[i][j]=false;
                }
            }
        }
        return dp[n][m];
    }
    // public boolean  call(int i,int j,String s,String t,Boolean [][]dp){
    //     if(i==0 && j==0) return true;
    //     if(i==0 && j>0) {
    //         for(int k=1;k<=j;k++){
    //             if(t.charAt(k-1)!='*') return false;
    //         }
    //         return true;
    //     }
    //     if(j==0 && i>0) return false;
    //     if (dp[i][j] != null) return dp[i][j];

    //     if(s.charAt(i-1)==t.charAt(j-1) || t.charAt(j-1)=='?'){
    //         return dp[i][j]= call(i-1,j-1,s,t,dp);
    //     }
    //     else if(t.charAt(j-1)=='*'){
    //         return dp[i][j] =call(i-1,j,s,t,dp)||call(i,j-1,s,t,dp);
    //     }
    //     return false;
    // }
}