class Solution {
    public boolean isValidSudoku(char[][] board) {
        return call(board);
    }
    public boolean call(char [][]board){
        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){
                char num=board[i][j];
                if(board[i][j]!='.'){
                    board[i][j]='.';
                    if(!check(board,num,i,j)) return false;
                    board[i][j]=num;
                }
            }
        }
        return true;
    }
    public boolean check(char [][]b,char k,int r,int c){
        for(int i=0;i<9;i++){
            if(b[i][c]==k) return false;
            if(b[r][i]==k) return false;
        }
        int row=r-r%3;
        int col=c-c%3;

        for(int i=row;i<row+3;i++){
            for(int j=col;j<col+3;j++){
                if(b[i][j]==k) return false;
            }   
        }
        return true;
        
    }
}