class Solution {
    public int[][] generateMatrix(int n) {
        int [][]mat=new int[n][n];
        int r=0;
        int c=0;
        int lr=n-1;
        int lc=n-1;
        int cnt=1;
        while(r<=lr && c<=lc){
            for(int i=c;i<=lc;i++){
                mat[r][i]=cnt++;
            }
            r++;
            for(int i=r;i<=lr;i++){
                mat[i][lc]=cnt++;
            }
            lc--;

            if(r>lr || c>lc) break;

            for(int i=lc;i>=c;i--){
                mat[lr][i]=cnt++;
            }
            lr--;
            for(int i=lr;i>=r;i--){
                mat[i][c]=cnt++;
            }
            c++;
        }
        return mat;
    }
}