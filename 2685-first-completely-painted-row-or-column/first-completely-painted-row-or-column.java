// class pair{
//     int row;
//     int col;
//     pair(int row,int col){
//         this.row=row;
//         this.col=col;
//     }
// }
class Solution {
    public int firstCompleteIndex(int[] arr, int[][] mat) {
        int n=mat.length;
        int m=mat[0].length;
        Map<Integer,Integer>mp=new HashMap<>();
        int []rc=new int[n];
        int []cc=new int[m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                mp.put(mat[i][j],i*m+j);
                rc[i]++;
                cc[j]++;
            }
        }
        int k=0;

        for(int i:arr){
            int idx=mp.get(i);
            int row=idx/m;
            int col=idx%m;
            rc[row]--;
            cc[col]--;
            if(rc[row]==0 || cc[col]==0) return k;
            k++;
        }
        return -1;
    }
}