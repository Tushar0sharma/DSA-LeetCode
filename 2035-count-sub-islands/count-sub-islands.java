class Solution {
    public int countSubIslands(int[][] grid1, int[][] grid2) {
        return call(grid1,grid2);
    }
    boolean flag=true;
    public int call(int[][] g1, int[][] g2){
        int n=g2.length;
        int m=g2[0].length;
        int cnt=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(g2[i][j]==1){
                    flag=true;
                    c(g1,g2,i,j,n,m);
                    if(flag) cnt++;
                }
            }
        }
        return cnt;
    }
    public void c(int [][]g1,int [][]g2,int i,int j,int n,int m){
        if(i>=n || j>=m || i<0 || j<0 || g2[i][j]!=1) return;
        if(g1[i][j]!=1) flag=false;
        g2[i][j]=0;
        c(g1,g2,i+1,j,n,m);
        c(g1,g2,i,j+1,n,m);
        c(g1,g2,i-1,j,n,m);
        c(g1,g2,i,j-1,n,m);
    }
}