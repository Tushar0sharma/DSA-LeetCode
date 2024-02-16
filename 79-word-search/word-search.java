class Solution {
    public boolean exist(char[][] board, String word) {
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[0].length;j++){
                if(board[i][j]==word.charAt(0)){
                    boolean a=solve(board,word,i,j,board[0].length,board.length,0);
                    if(a) return true;
                }
            }
        }
        return false;
    }
    public boolean solve(char[][]board,String word,int row,int col,int m,int n,int idx){
        if(idx==word.length()){
            return true;
        }
        if(row<0||col<0||row>=n||col>=m||board[row][col]!=word.charAt(idx)){
            return false;
        }
        board[row][col]='#';
        int[]r={0,0,-1,1};
        int[]c={1,-1,0,0};
        for(int i=0;i<c.length;i++){
            boolean ans=solve(board,word,row+r[i],col+c[i],m,n,idx+1);
            if(ans) return true;
        }
        board[row][col]=word.charAt(idx);
        return false;
    }
}