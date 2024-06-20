class Solution {
    public List<List<String>> solveNQueens(int n) {
        char[][]board=new char[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                board[i][j]='.';
            }
        }
        List<List<String>>ll=new ArrayList<>();
        call(ll,0,board,n);
        return ll;
    }
    public void call(List<List<String>>ll,int row,char[][]board,int n){
        if(row==board.length){
            print(board,ll, n);
            return;
        }
        for(int col=0;col<n;col++){
            if(safe(board,row,col,n)){
                board[row][col]='Q';
                call(ll,row+1,board,n);
                board[row][col]='.';
            } 
        }
        return ;
    }
    public void print(char[][] board,List<List<String>>ll,int n){
        List<String>l=new ArrayList<>();
        for(int i=0;i<n;i++){
            String s=new String(board[i]);
            l.add(s);
        }
        ll.add(l);
        return ;
    }
    public boolean safe(char [][]board,int row,int col,int n){
        for(int i=0;i<n;i++){
            if(board[row][i]=='Q') return false;
            if(board[i][col]=='Q') return false;
        }
        int leftmax=Math.min(row,col);
        for(int i=0;i<=leftmax;i++){
            if(board[row-i][col-i]=='Q') return false;
        }
        int rightmax=Math.min(row,n-1-col);
        for(int i=0;i<=rightmax;i++){
            if(board[row-i][col+i]=='Q') return false;
        }
        return true;
    }
}