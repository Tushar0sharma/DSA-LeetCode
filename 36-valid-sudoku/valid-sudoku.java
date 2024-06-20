class Solution {
    public boolean isValidSudoku(char[][] board) {
        return solve(board); 
    }
    public boolean solve(char[][]board){
        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){
                char num=board[i][j];
                if(board[i][j]!='.'){
                    board[i][j]='.';
                    if(!safe(i,j,board,num)){
                        return false;
                    }
                    board[i][j]=num;
                }
            }
        }
        return true;
    }
    public boolean safe(int row,int col,char[][]board,char num){
        for(int i=0;i<9;i++){
            if(board[i][col]==num) return false;
            if(board[row][i]==num) return false;
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