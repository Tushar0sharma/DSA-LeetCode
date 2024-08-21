class Solution {
    Integer [][]dp=new Integer[501][501];
    public boolean stoneGame(int[] piles) {
        return call(0,piles.length-1,piles)>0;
    }
    public int call(int i,int j,int []p){
        if(i>j) return 0;
        if(dp[i][j]!=null) return dp[i][j];
        int o1=p[i]-call(i+1,j,p);
        int o2=p[j]-call(i,j-1,p);
        return dp[i][j]=Math.max(o1,o2);
    }
}