class Solution {
    public void solveSudoku(char[][] board) {
        solve(board,0,0);
            
        
    }
    public boolean solve(char[][]board,int row,int col){
        // int row,col;
        // int []emptycell=emptycell(board,n);
        // row=emptycell[0];
        // col=emptycell[1];
        // if (row == -1 && col == -1) {
        //     return true;
        // }
         if (row == board.length) {
            return true;
        }
        if (col == board[0].length) {
            return solve(board, row + 1, 0);
        }
        if (board[row][col] != '.') {
            return solve(board, row, col + 1);
        }
        for(char num='1';num<='9';num++){
            if(issafe(board,num,row,col)){
                board[row][col]=num;
                if(solve(board,row,col+1))
                   return true;
                board[row][col]='.';
            }
        }
        return false;
    }
    // public int[] emptycell(char[][]board,int n){
    //     int[]cell={-1,-1};
    //     for(int i=0;i<n;i++){
    //         for(int j=0;j<n;j++){
    //             if(board[i][j]=='.'){
    //                 cell[0]=i;
    //                 cell[1]=j;
    //                 return cell;
    //             }
    //         }
    //     }
    //     return cell;
    // }
    public boolean issafe(char[][]board,int num,int row,int col){
        // for(int i=0;i<board.length;i++){
        //     if(board[i][col]==num || board[row][i]==num){
        //         return false;
        //     }
        // }
        // int startrow=row- row%3;
        // int startcol=col- col%3;
        // for(int i=0;i<3;i++){
        //     for(int j=0;j<3;j++){
        //         if(board[startrow+i][startcol+i]==num){
        //             return false;
        //         }
        //     }
        // }
         for (int i = 0; i < board.length; i++) {
            if (board[i][col] == num) {
                return false;
            }
            if (board[row][i] == num) {
                return false;
            }
             int subgridRow = 3 * (row / 3) + i / 3; 
            int subgridCol = 3 * (col / 3) + i % 3; 
 
            if (board[subgridRow][subgridCol] == num) {
                return false;
            }
        }
        return true;
    }
}