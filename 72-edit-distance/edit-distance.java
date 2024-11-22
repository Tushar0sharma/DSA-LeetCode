class Solution {
    public int minDistance(String word1, String word2) {
        int n=word1.length();
        int m=word2.length();
        int [][]dp=new int[n][m];
        for(int []i:dp) Arrays.fill(i,-1);
        return call(0,0,n,m,word1,word2,dp);
    }
    public int call(int i,int j,int n,int m ,String word1,String word2,int [][]dp){
        if(i==n && j==m) return 0;
        if(i==n) return m-j;
        if(j==m) return n-i;
        if(dp[i][j]!=-1) return dp[i][j];
        if(word1.charAt(i)==word2.charAt(j)){
            return call(i+1,j+1,n,m,word1,word2,dp);
        }
        int a=1+call(i+1,j+1,n,m,word1,word2,dp);
        int b=1+call(i,j+1,n,m,word1,word2,dp);
        int c=1+call(i+1,j,n,m,word1,word2,dp);
        int ans=Math.min(a,b);
        ans=Math.min(ans,c);
        return dp[i][j]=ans;
    }
}