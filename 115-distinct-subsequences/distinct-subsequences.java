class Solution {
    public int numDistinct(String s, String t) {
        int n=s.length();
        int m=t.length();
        int []dp=new int[m+1];

        dp[0]=1;

        for(int i=1;i<=n;i++){
            int []curr=new int[m+1];
            curr[0]=1;
            for(int j=1;j<=m;j++){
                if(s.charAt(i-1)==t.charAt(j-1)){
                    curr[j]=dp[j-1]+dp[j];
                }
                else curr[j]=dp[j];
            }
            dp=curr;
        }
        return dp[m];
    }
}