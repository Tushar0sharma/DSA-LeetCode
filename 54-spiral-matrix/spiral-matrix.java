class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer>l=new ArrayList<>();
        if(matrix.length==0 || matrix==null) return l;

        int rowmin=0, rowmax=matrix.length-1, colmin=0, colmax=matrix[0].length-1;

        while(rowmin<=rowmax && colmin<=colmax){

            for(int i=colmin;i<=colmax;i++){
                l.add(matrix[rowmin][i]);
            }
            rowmin++;

            for(int i=rowmin;i<=rowmax;i++){
                l.add(matrix[i][colmax]);
            }
            colmax--;

            if(rowmin>rowmax || colmin>colmax) break;

            for(int i=colmax;i>=colmin;i--){
                l.add(matrix[rowmax][i]);
            }
            rowmax--;

            for(int i=rowmax;i>=rowmin;i--){
                l.add(matrix[i][colmin]);
            }
            colmin++;
        }
        return l;

    }
}