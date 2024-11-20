class Solution {
    public int longestCommonSubsequence(String text1, String text2) {
        int [][]dp=new int[text1.length()][text2.length()];
        for(int[]i:dp) Arrays.fill(i,-1);
        call(0,0,text1.length(),text1,text2.length(),text2,dp);
        return dp[0][0];
    }
    public int call(int i,int j,int n,String s,int m,String t,int [][]dp){
        if(i==n || j==m) {
            return 0;
        }
        if(dp[i][j]!=-1) return dp[i][j];
        int ans=0;
        if(s.charAt(i)==t.charAt(j)){
            ans=1+call(i+1,j+1,n,s,m,t,dp);
        }
        else{
            int a=call(i+1,j,n,s,m,t,dp);
            int b=call(i,j+1,n,s,m,t,dp);
            ans+=Math.max(a,b);
        }
        return dp[i][j]=ans;
    }
}