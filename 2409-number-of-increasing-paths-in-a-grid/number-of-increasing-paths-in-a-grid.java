class Solution {
    public int countPaths(int[][] grid) {
        int n=grid.length;
        int m=grid[0].length;
        int [][]arr=new int[n][m];
        for(int []i:arr) Arrays.fill(i,-1);
        int ans=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                ans=(ans+solve(grid,i,j,-1,arr))%((int)1e9+7);
            }
        }
        return ans;
    }
    public int solve(int[][]grid,int i,int j,int prev,int[][]arr){
        if(i<0 || j<0 || i>=arr.length || j>=arr[0].length || prev>=grid[i][j]) return 0;
        if(arr[i][j]!=-1) return arr[i][j];

        int l=solve(grid,i,j-1,grid[i][j],arr);
        int r=solve(grid,i,j+1,grid[i][j],arr);
        int u=solve(grid,i-1,j,grid[i][j],arr);
        int d=solve(grid,i+1,j,grid[i][j],arr);
        
        return arr[i][j]=(1+l+r+u+d)%((int)1e9+7);
    }
}