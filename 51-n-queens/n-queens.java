class Solution {
    public List<List<String>> solveNQueens(int n) {
        List<List<String>>ll=new ArrayList<>();
        char [][]board=new char[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                board[i][j]='.';
            }
        }
        call(0,n,board,ll);
        return ll;
    }
    public void call(int i,int n,char [][]board,List<List<String>>ll){
        if(i==n){
            List<String>l=new ArrayList<>();
            for (int k = 0; k < n; k++) {
                l.add(new String(board[k]));
            }
            ll.add(new ArrayList<>(l));
            return;
        }
        if(i<n){
            for(int j=0;j<n;j++){
                if(issafe(i,j,board)){
                    board[i][j]='Q';
                    call(i+1,n,board,ll);
                    board[i][j]='.';
                }
            }
        }
    }
    public boolean issafe(int i,int j,char [][]b){
        for(int k=0;k<b.length;k++){
            if(b[i][k]=='Q' || b[k][j]=='Q') return false;
        }
        int leftmax=Math.min(i,j);
        for(int k=0;k<=leftmax;k++){
            if(b[i-k][j-k]=='Q') return false;
        }       
        int rightmax=Math.min(i,b.length-j-1);
        for(int k=0;k<=rightmax;k++){
            if(b[i-k][j+k]=='Q') return false;
        }       
        return true;
    }
}