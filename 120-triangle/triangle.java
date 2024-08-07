class Solution {
    public int minimumTotal(List<List<Integer>> t) {
        int n=t.size();
        int [][]dp=new int[n][n];
        for(int i=0;i<n;i++){
            dp[n-1][i]=t.get(n-1).get(i);
        }
        for(int i=n-2;i>=0;i--){
            for(int j=i;j>=0;j--){
                int d=t.get(i).get(j)+dp[i+1][j];
                int dg=t.get(i).get(j)+dp[i+1][j+1];
                dp[i][j]=Math.min(d,dg);
            }
        }
        return dp[0][0];        
    }
}