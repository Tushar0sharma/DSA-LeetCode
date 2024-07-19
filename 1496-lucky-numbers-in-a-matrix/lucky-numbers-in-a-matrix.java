class Solution {
    public List<Integer> luckyNumbers (int[][] matrix) {
        List<Integer>l=new ArrayList<>();
        List<Integer>mini=new ArrayList<>();
        int n=matrix.length;
        int m=matrix[0].length;
        for(int i=0;i<n;i++){
            int min=Integer.MAX_VALUE;
            for(int j=0;j<m;j++){
                min=Math.min(min,matrix[i][j]);
            }
            mini.add(min);
        }
        for(int i=0;i<m;i++){
            int min=Integer.MIN_VALUE;
            for(int j=0;j<n;j++){
                min=Math.max(min,matrix[j][i]);
            }
            if(mini.contains(min)){
                l.add(min);
            }
        }
        return l;
    }
}