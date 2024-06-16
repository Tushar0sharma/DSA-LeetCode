class Solution {
    public boolean exist(char[][] board, String word) {
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[0].length;j++){
                if(word.charAt(0)==board[i][j]){
                    boolean a=solve(i,j,board,word,0);
                    if(a) return true;
                }
            }
        }
        return false;
    }
    public boolean solve(int i,int j,char[][]board,String word,int idx){
        if(idx==word.length()){
            return true;
        }
        if(i>=board.length || j>=board[0].length || i<0 || j<0 || board[i][j]!=word.charAt(idx)){
            return false;
        }
        board[i][j]='#';
        int []r={1,-1,0,0};
        int []c={0,0,1,-1};

        for(int k=0;k<4;k++){
            boolean ans=solve(i+r[k],j+c[k],board,word,idx+1);
            if(ans) return true;
        }
        board[i][j]=word.charAt(idx);
        return false;
    }
}