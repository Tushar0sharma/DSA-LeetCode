class Solution {
    public boolean exist(char[][] board, String word) {
        int n=board.length;
        int m=board[0].length;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(board[i][j]==word.charAt(0)){
                    if(call(board,n,m,i,j,word,0)) return true;
                }
            }
        }
        return false;
    }
    public boolean call(char[][]board,int n,int m,int i,int j,String w,int idx){
        if(idx==w.length()) return true;
        if(i>=n || j>=m || i<0 || j<0 || board[i][j]!=w.charAt(idx) ) return false;
        int []r={1,-1,0,0};
        int []c={0,0,-1,1};
        board[i][j]='#';
        for(int k=0;k<4;k++){
            if(call(board,n,m,i+r[k],j+c[k],w,idx+1)) return true;
        }
        board[i][j]=w.charAt(idx);
        return false;
    }
}