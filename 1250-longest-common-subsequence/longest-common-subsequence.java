class Solution {
    public int longestCommonSubsequence(String s1, String s2) {
        int [][]dp=new int[s1.length()][s2.length()];
        for(int []i:dp) Arrays.fill(i,-1);
        return call(s1,s2,s1.length()-1,s2.length()-1,dp);
    }
    public int call(String s1,String s2,int i,int j,int [][]dp){
        if(i<0 || j<0) return 0;
        if(dp[i][j]!=-1) return dp[i][j];
        if(s1.charAt(i)==s2.charAt(j)){
            return dp[i][j]=1+call(s1,s2,i-1,j-1,dp);
        }
        return dp[i][j]=Math.max(call(s1,s2,i-1,j,dp),call(s1,s2,i,j-1,dp));
    }
}