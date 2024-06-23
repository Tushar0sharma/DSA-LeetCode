class Solution {
    public int minimumArea(int[][] grid) {
        int n=grid.length;
        int m=grid[0].length;
        int up=n;
        int down=0;
        int right=0;
        int left=m;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j]==1){
                    up=Math.min(up,i);
                    down=Math.max(down,i);
                    left=Math.min(left,j);
                    right=Math.max(right,j);
                }
            }
        }
        return (right-left+1)*(down-up+1);
    }
}