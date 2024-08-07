class Solution {
    public int minimumTotal(List<List<Integer>> t) {
        int n=t.size();
        int [][]dp=new int[n][n];
        for(int []i:dp) Arrays.fill(i,-1);
        dp[0][0]=call(dp,n,0,0,t);
        return dp[0][0];
    }
    public int call(int [][]dp,int n,int i,int j,List<List<Integer>> t){
        if(i==n-1 && j<t.get(i).size()) return t.get(i).get(j);
        if(i>n && j>=t.get(i).size()) return Integer.MAX_VALUE;
        if(dp[i][j]!=-1) return dp[i][j];
        int d=t.get(i).get(j)+call(dp,n,i+1,j,t);
        int dg=t.get(i).get(j)+call(dp,n,i+1,j+1,t);

        return dp[i][j]=Math.min(d,dg);
        

    }
}