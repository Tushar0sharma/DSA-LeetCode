class Solution {
    public boolean checkValid(int[][] matrix) {
        int n=matrix.length;
        int m=matrix[0].length;
        for(int i=0;i<n;i++){
            Set<Integer>s=new HashSet<>();
            for(int j=0;j<m;j++){
                s.add(matrix[i][j]);
            }
            if(s.size()!=m) return false;
        }
        for(int i=0;i<m;i++){
            Set<Integer>s=new HashSet<>();
            for(int j=0;j<n;j++){
                s.add(matrix[j][i]);
            }
            if(s.size()!=m) return false;
        }
        return true;
    }
}