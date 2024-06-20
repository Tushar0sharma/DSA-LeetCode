class Solution {
    public void solveSudoku(char[][] board) {
        solve(board);
    }
    public boolean solve(char[][]board){
        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){
                if(board[i][j]=='.'){
                    for(char c='1';c<='9';c++){
                        if(isvalid(i,j,board,c)){
                            board[i][j]=c;

                            if(solve(board)) return true;
                            else board[i][j]='.';
                        }   
                    }
                    return false;
                }
            }
        }
        return true;
    }
    public boolean isvalid(int row,int col,char[][]board,char num){
        for(int i=0;i<9;i++){
            if(board[row][i]==num) return false;
            if(board[i][col]==num) return false;
        }
        int start=row-row%3;
        int end=col-col%3;

        for(int i=start;i<start+3;i++){
            for(int j=end;j<end+3;j++){
                if(board[i][j]==num) return false;
            }
        }
        return true;
    }
}