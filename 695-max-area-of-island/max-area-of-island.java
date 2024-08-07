class Solution {
    boolean[][]seen;
    public int maxAreaOfIsland(int[][] grid) {
        seen=new boolean[grid.length][grid[0].length];
        int ans=0;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                ans=Math.max(ans,area(grid,i,j));
            }
        }
        return ans;
    }
    public int area(int [][]grid,int r,int c){
        if(r<0 || c<0 || r>=grid.length || c>=grid[0].length || seen[r][c] || grid[r][c]==0) return 0;
        seen[r][c]=true;
        return (1+area(grid,r+1,c)+area(grid,r,c+1)+area(grid,r-1,c)+area(grid,r,c-1));
    }
}