class Solution {
    public int numMagicSquaresInside(int[][] grid) {
        int n=grid.length;
        int m=grid[0].length;
        if(n<3 || m<3) return 0;
        int cnt=0;
        for(int i=0;i<n-2;i++){
            for(int j=0;j<m-2;j++){
                if(sub(i,j,grid)) cnt++;
            }
        }
        return cnt;
    }
    public boolean sub(int r,int c,int [][]grid){

        Set<Integer>s=new HashSet<>();

        for(int i=r;i<r+3;i++){
            for(int j=c;j<c+3;j++){
                if(s.contains(grid[i][j])|| grid[i][j]>9 || grid[i][j]<1) return false;
                s.add(grid[i][j]);
            }
        }
        int n=grid.length;
        int m=grid[0].length;
        int sum1=grid[r][c]+grid[r+1][c]+grid[r+2][c];
        int sum2=grid[r][c+1]+grid[r+1][c+1]+grid[r+2][c+1];
        int sum3=grid[r][c+2]+grid[r+1][c+2]+grid[r+2][c+2];
        if(sum1!=sum2 || sum1!=sum3) return false;

        
        int sum4=grid[r][c]+grid[r][c+1]+grid[r][c+2];
        int sum5=grid[r+1][c]+grid[r+1][c+1]+grid[r+1][c+2];
        int sum6=grid[r+2][c]+grid[r+2][c+1]+grid[r+2][c+2];
        if(sum4!=sum5 || sum4!=sum6) return false;

        int sum7=grid[r][c]+grid[r+1][c+1]+grid[r+2][c+2];
        int sum8=grid[r][c+2]+grid[r+1][c+1]+grid[r+2][c];
        
        if(sum7!=sum8) return false;
        return true;        
    }
}