class Solution {
    public void rotate(int[][] m) {
        int row=m.length;
        int col=m[0].length;
        //first transpose the matrix
        for(int i=0;i<row;i++){
            for(int j=i;j<col;j++){
                int temp=m[i][j];
                m[i][j]=m[j][i];
                m[j][i]=temp;
            }
        }
        //then sap the elements
        for(int i=0;i<row;i++){
            for(int j=0;j<row/2;j++){
                int temp=m[i][j];
                m[i][j]=m[i][row-j-1];
                m[i][row-j-1]=temp;
            }
        }

    }
}