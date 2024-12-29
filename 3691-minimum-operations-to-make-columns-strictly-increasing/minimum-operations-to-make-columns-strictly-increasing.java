class Solution {
    public int minimumOperations(int[][] grid) {
        int opr=0;
        for(int i=0;i<grid[0].length;i++){
            for(int j=1;j<grid.length;j++){
                if(grid[j][i]<=grid[j-1][i]) {
                    int a=Math.abs(grid[j-1][i]-grid[j][i])+1;
                    grid[j][i]=grid[j][i]+a;
                    opr+=a;
                }
            }
        }
        return opr;
    }
}