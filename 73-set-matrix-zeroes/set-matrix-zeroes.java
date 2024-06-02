class Solution {
    public void setZeroes(int[][] m) {
        int []rows=new int[m.length];
        int []col=new int[m[0].length];
        
        for(int i=0;i<m.length;i++){
            for(int j=0;j<m[0].length;j++){
                if(m[i][j]==0){
                    rows[i]=1;
                    col[j]=1;
                }
            }
        }

        for(int i=0;i<m.length;i++){
            for(int j=0;j<m[0].length;j++){
                if(rows[i]==1 || col[j]==1){
                    m[i][j]=0;
                }
            }
        }
    }
}