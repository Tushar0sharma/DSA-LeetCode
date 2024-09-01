class Solution {
    public int[][] construct2DArray(int[] original, int m, int n) {
        int [][]grid=new int[m][n];
        int a=original.length;
        if(a!=m*n) return new int[0][0];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                int idx=i*n+j;
                grid[i][j]=original[idx];
            }
        }
        return grid;
    }
}