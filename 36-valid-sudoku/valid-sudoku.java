class Solution {
    public boolean isValidSudoku(char[][] board) {
        boolean b=solve(board);  
        return b;   
    }
    public boolean solve(char [][]board){
        int n=board.length;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                char num=board[i][j];
                if(board[i][j]!='.'){
                    board[i][j]='.';
                    if(!safe(board,num,i,j)){
                        return false;
                    }
                    board[i][j]=num;
                }
            }
        }
        return true;
    }
    public boolean safe(char[][]board,char k,int i,int j){
        for(int x=0;x<9;x++){
            if(board[i][x]==k){
                return false;
            } 
        }
        for(int x=0;x<9;x++){
            if(board[x][j]==k){
                return false;
            }
        }
        int startRow = i - i % 3;
        int startCol = j - j % 3;

        for(int a=startRow;a<startRow+3;a++){
            for(int b=startCol;b<startCol+3;b++){
                if(board[a][b]==k){
                    return false;
                }
            }
        }
        return true;
    }
}