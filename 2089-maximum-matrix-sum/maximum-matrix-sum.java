class Solution {
    public long maxMatrixSum(int[][] matrix) {
        long sum=0;
        int small=Integer.MAX_VALUE;
        int cnt=0;
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(matrix[i][j]<0){
                    cnt++;
                }
                sum+=Math.abs(matrix[i][j]);
                small=Math.min(small,Math.abs(matrix[i][j]));
            }
        }
        if(cnt%2==0) return sum;
        else return sum-2*small;
    }
}