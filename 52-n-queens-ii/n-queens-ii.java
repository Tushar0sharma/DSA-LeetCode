class Solution {
    public int totalNQueens(int n) {
        boolean[][]board=new boolean[n][n];
        int count=queen(board,0);
        return count;
        
    }
    static int queen(boolean[][]board,int row){
        if(row==board.length){
            return 1;
        }
        int cnt=0;
        for(int col=0;col<board.length;col++){
            if(issafe(board,row,col)){
                board[row][col]=true;
                cnt+=queen(board,row+1);
                board[row][col]=false;
            }
        }
        return cnt;
    }
    static boolean issafe(boolean[][]board,int row,int col){
        for(int i=0;i<row;i++){
            if(board[i][col]){
                return false;
            }
        }
        for(int i=0;i<col;i++){
            if(board[row][i]){
                return false;
            }
        }
        int left=Math.min(row,col);
        for(int i=0;i<=left;i++){
            if(board[row-i][col-i]){
                return false;
            }
        }
        int right=Math.min(row,board.length-col-1);
        for(int i=0;i<=right;i++){
            if(board[row-i][col+i]){
                return false;
            }
        }
        return true;
    }
}