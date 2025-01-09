class Solution {
    public boolean exist(char[][] board, String word) {
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[0].length;j++){
                if(board[i][j]==word.charAt(0)){
                    if(call(i,j,word,board,new boolean[board.length][board[0].length],0)) return true;
                }
            }
        }
        return false;
    }
    public boolean call(int i,int j,String w,char[][]ch,boolean [][]vis,int k){
        if(k==w.length()) return true;
        if(i<0  || j<0 || i>=ch.length ||j>=ch[0].length  || w.charAt(k)!=ch[i][j] || vis[i][j]) return false;
        vis[i][j]=true;
        boolean b= call(i+1,j,w,ch,vis,k+1)||call(i-1,j,w,ch,vis,k+1)||call(i,j-1,w,ch,vis,k+1)||call(i,j+1,w,ch,vis,k+1);
        vis[i][j]=false;
        return b;
    }
}