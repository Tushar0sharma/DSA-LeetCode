class Solution {
    public int uniquePathsWithObstacles(int[][] o) {
        if(o[o.length-1][o[0].length-1]==1 || o[0][0]==1) return 0;
        int n=o.length;
        int m=o[0].length;
        int []dp=new int[m];
        dp[0]=1;
        for(int i=0;i<n;i++){
            int []temp=new int[m];
            // temp[0]=1;
            for(int j=0;j<m;j++){
                if(j>0)
                temp[j]=temp[j-1]+dp[j];
                if(o[i][j]==1) temp[j]=0;
                else if(j == 0 && dp[j] == 1) temp[j]=1;
            }
            dp=temp;
        }
        return dp[m-1];
    }
}