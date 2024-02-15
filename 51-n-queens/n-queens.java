class Solution {
    public List<List<String>> solveNQueens(int n) {
        char[][]board=new char[n][n];
         for(int i = 0; i < board.length; i++) {
            for(int j = 0; j < board.length; j++) {
                board[i][j] = '.';
            }
         }
            List<List<String>>ll=new ArrayList<>();
         queen(board,0,ll);
         return ll;
        
    }
    public void queen(char[][]board,int row,List<List<String>>ll){
        if(row==board.length){
            ll.add(print(board));
           return ;
        }
        for(int col=0;col<board.length;col++){
            if(issafe(board,row,col)){
            board[row][col]='Q';
            queen(board,row+1,ll);
            board[row][col]='.';
            }
        }
        
    }
    private List<String> print(char[][]board){
        List<String>l=new ArrayList<>();
       for(int i=0;i<board.length;i++){
           String s=new String(board[i]);
           l.add(s);
       }
       return l;
    }
    public boolean issafe(char[][] board,int row,int col){
        for(int i=0;i<row;i++){
            if(board[i][col]=='Q'){
                return false;
            }
        }
        for(int i=0;i<col;i++){
            if(board[row][i]=='Q'){
                return false;
            }
        }
        int leftmax=Math.min(row,col);
        for(int i=0;i<=leftmax;i++){
            if(board[row-i][col-i]=='Q'){
                return false;
            }
        }
        int rightmax=Math.min(row,board.length-col-1);
        for(int i=0;i<=rightmax;i++){
             if(board[row-i][col+i]=='Q'){
                return false;
            }
        }
       return true;
    }
}