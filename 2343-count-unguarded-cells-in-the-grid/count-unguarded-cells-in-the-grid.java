class Solution {
    public int countUnguarded(int m, int n, int[][] guards, int[][] walls) {
        int ans=0;
        int [][]grid=new int[m][n];
        for(int []i:walls){
            grid[i[0]][i[1]]=5;
        }
        for(int []i:guards){
            grid[i[0]][i[1]]=4;
        }
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(grid[i][j]==4){
                    for(int a=i+1;a<m;a++){
                        if(grid[a][j]==4|| grid[a][j] == 5){
                            break;
                        }
                        grid[a][j]=-1;
                    }
                    for(int b=j+1;b<n;b++){
                        if(grid[i][b]==4|| grid[i][b] == 5){
                            break;
                        }
                        grid[i][b]=-1;
                    }
                    for(int a=i-1;a>=0;a--){
                        if(grid[a][j]==4|| grid[a][j] == 5){
                            break;
                        }
                        grid[a][j]=-1;
                    }
                    for(int b=j-1;b>=0;b--){
                        if(grid[i][b]==4|| grid[i][b] == 5){
                            break;
                        }
                        grid[i][b]=-1;
                    }
                }
            }
        }
        for(int []i:grid){
            for(int j:i) if(j==0) ans++;
        }
        return ans;
    }
}