class Solution {
    public void solve(char[][] board) {
        if(board.length==0) return;
        int n=board.length;
        int m=board[0].length;
        for(int i=0;i<n;i++){
            dfs(board,i,0,n,m);
            dfs(board,i,m-1,n,m);
        }
        for(int i=0;i<m;i++){
            dfs(board,0,i,n,m);
            dfs(board,n-1,i,n,m);
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(board[i][j]=='O') board[i][j]='X';
                else if(board[i][j]=='P') board[i][j]='O';
            }
        }
    }
    public void dfs(char[][]board,int i,int j,int n,int m){
        if(i<0 || j<0 || i==n || j==m || board[i][j]!='O') return ;
        board[i][j]='P';
        dfs(board,i+1,j,n,m);
        dfs(board,i,j+1,n,m);
        dfs(board,i,j-1,n,m);
        dfs(board,i-1,j,n,m);
    }
}