class Solution {
    public int minFlips(int[][] mat) {
        int a=call(0,0,mat);
        return a==10000?-1:a;
    }
    public int call(int i,int j,int [][]mat){
        if(j==mat[0].length){
            i++;
            j=0;
        }
        if(i==mat.length){
            return check(mat)?0:10000;
        }
        flip(mat,i,j);
        int a=call(i,j+1,mat)+1;
        flip(mat,i,j);
        int b=call(i,j+1,mat);
        return Math.min(a,b);
    }
    public void flip(int [][]mat,int i,int j){
        mat[i][j]^=1;
        if(i+1<mat.length) mat[i+1][j]^=1;
        if(i-1>=0) mat[i-1][j]^=1;
        if(j+1<mat[0].length) mat[i][j+1]^=1;
        if(j-1>=0) mat[i][j-1]^=1;
    }
    public boolean check(int [][]mat){
        for(int []i:mat) for(int j:i) if(j==1) return false;
        return true;
    }
}