class Solution {
    public void solve(char[][] board) {
        int n=board.length;
        int m=board[0].length;
        boolean [][]vis=new boolean[n][m];
        for(int i=0;i<n;i++){
            dfs(vis,board,i,0);
            dfs(vis,board,i,m-1);
        }
        for(int i=0;i<m;i++){
            dfs(vis,board,0,i);
            dfs(vis,board,n-1,i);
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(!vis[i][j] && board[i][j]=='O') board[i][j]='X';
            }
        }

    }
    public void dfs(boolean [][]vis,char [][]board,int i,int j){
        if(i<0 || j<0 || i>=vis.length || j>=vis[0].length|| board[i][j]!='O' || vis[i][j]) return;
        vis[i][j]=true;
        int []r={0,0,-1,1};
        int []c={1,-1,0,0};
        for(int k=0;k<4;k++){
            int nr=i+r[k];
            int nc=j+c[k];
            dfs(vis,board,nr,nc);
        }

    }
}