class Solution {
    public int[][] onesMinusZeros(int[][] grid) {
        int n=grid.length;
        int m=grid[0].length;
        int []oner=new int[n];
        int []onec=new int[m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j]==1){
                    oner[i]++;
                    onec[j]++;
                }
            }
        }
        int [][]ans=new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                ans[i][j]=oner[i]-(n-oner[i])+onec[j]-(m-onec[j]);
            }
        }
        return ans;
    }
}