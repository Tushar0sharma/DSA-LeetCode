class Solution {
    public boolean checkValid(int[][] matrix) {
        int n=matrix.length;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                int idx=Math.abs(matrix[i][j])-1;
                if(matrix[i][idx]<0) return false;
                matrix[i][idx]=-matrix[i][idx];
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                int idx=Math.abs(matrix[j][i])-1;
                if(matrix[idx][i]>0) return false;
                matrix[idx][i]=-matrix[idx][i];
            }
        }
        return true;
    }
}