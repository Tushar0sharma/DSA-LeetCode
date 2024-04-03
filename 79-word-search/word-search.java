class Solution {
    public boolean exist(char[][] board, String word) {
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[0].length;j++){
                if(board[i][j]==word.charAt(0)){
                    boolean b=call(board,word,i,j,board[0].length,board.length,0);
                    if(b) return true;
                }
            }
        }
        return false;
    }
    public boolean call(char[][] board, String word,int i,int j,int m,int n,int idx){
        if(word.length()==idx){
            return true;
        }
        if(i<0 || j<0 ||i>=n || j>=m || board[i][j]!=word.charAt(idx)){
            return false;
        }
        board[i][j]='#';
        int[]r={0,0,-1,1};
        int[]c={1,-1,0,0};
        for(int k=0;k<c.length;k++){
            boolean ans=call(board,word,i+r[k],j+c[k],m,n,idx+1);
            if(ans) return true;
        }
        board[i][j]=word.charAt(idx);
        return false;
    }
}