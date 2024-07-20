class Solution {
    public int[][] restoreMatrix(int[] rowSum, int[] colSum) {
        int n=rowSum.length;
        int m=colSum.length;
        int []currrow=new int[n];
        int []currcol=new int[m];
        int [][]curr=new int[n][m];

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                curr[i][j]=Math.min(rowSum[i]-currrow[i],colSum[j]-currcol[j]);
                currrow[i]+=curr[i][j];
                currcol[j]+=curr[i][j];
            }
        }
        return curr;
    }
}