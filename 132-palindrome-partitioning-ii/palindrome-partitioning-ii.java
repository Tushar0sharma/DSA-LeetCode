class Solution {
    boolean[][]dp;
    int[]dp1;
    public int minCut(String s) {
        if(s.length()==1) return 0;
        int n=s.length();
        dp1=new int[n];
        Arrays.fill(dp1,-1);
        dp=new boolean[n][n];
        for(int len=1;len<=n;len++){
            for(int i=0;i+len-1<n;i++){
                int j=i+len-1;
                if(s.charAt(i)==s.charAt(j)){
                    dp[i][j]=(len<=2)||dp[i+1][j-1];
                }
            }
        }
        return call(s,0);
    }
    public int call(String s,int i){
        if(i==s.length()) return 0;
        if(dp[i][s.length()-1]) return 0;
        if(dp1[i]!=-1) return dp1[i];
        int mincost=Integer.MAX_VALUE;
        for(int j=i;j<s.length();j++){
            if(dp[i][j]){
                mincost=Math.min(mincost,1+call(s,j+1));
            }
        }
        return dp1[i]= mincost;
    }
}