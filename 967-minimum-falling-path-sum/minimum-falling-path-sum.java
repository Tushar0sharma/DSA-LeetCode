class Solution {
    public int minFallingPathSum(int[][] matrix) {
        int n=matrix.length;
        int m=matrix[0].length;
        int []dp=new int[m];
        for(int i=0;i<m;i++){
            dp[i]=matrix[n-1][i];
        }
        for(int i=n-2;i>=0;i--){
            int []temp=new int[m];
            for(int j=0;j<m;j++){
                int dl=Integer.MAX_VALUE;
                if(j-1>=0) dl=dp[j-1]+matrix[i][j];
                int dr=Integer.MAX_VALUE;
                if(j+1<m) dr=dp[j+1]+matrix[i][j];
                int d=matrix[i][j]+dp[j];

                temp[j]=Math.min(d,Math.min(dl,dr));
            }
            dp=temp;
        }
        int min=Integer.MAX_VALUE;
        for(int i=0;i<m;i++){
            min=Math.min(min,dp[i]);
        }
        return min;
    }
}