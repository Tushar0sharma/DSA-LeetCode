class Solution {
    public int maxProfit(int[] p) {
        int n=p.length;
        int [][][]dp=new int[n+1][2][3];
        // for(int [][]i:dp) for(int []j:i) Arrays.fill(j,-1);
        // return call(dp,0,1,2,p);
        for(int i=n-1;i>=0;i--){
            for(int j=0;j<=1;j++){
                for(int c=1;c<3;c++){
                    if(j==1){
                        dp[i][j][c]=Math.max(-p[i]+dp[i+1][0][c],dp[i+1][1][c]);
                    }
                    else{
                        dp[i][j][c]=Math.max(p[i]+dp[i+1][1][c-1],dp[i+1][0][c]);
                    }
                }
            }
        }
        return dp[0][1][2];
    }
    // public int call(int [][][]dp,int i,int j,int c,int []p){
    //     if(c==0) return 0;
    //     if(i==p.length) return 0;
    //     if(dp[i][j][c]!=-1) return dp[i][j][c];
    //     if(j==1){
    //         return dp[i][j][c]=Math.max(-p[i]+call(dp,i+1,0,c,p),call(dp,i+1,1,c,p));
    //     }
    //     else{
    //         return dp[i][j][c]=Math.max(p[i]+call(dp,i+1,1,c-1,p),call(dp,i+1,0,c,p));
    //     }
    // }
}