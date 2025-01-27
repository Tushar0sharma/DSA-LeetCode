class Solution {
    public List<Boolean> checkIfPrerequisite(int n, int[][] prerequisites, int[][] queries) {
        List<Boolean>l=new ArrayList<>();
        boolean [][]reach=new boolean[n][n];
        for(int []p:prerequisites){
            reach[p[0]][p[1]]=true;
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                for(int k=0;k<n;k++){
                    reach[j][k]=reach[j][k]||reach[j][i]&&reach[i][k];
                }
            }
        }
        for(int []i:queries){
            l.add(reach[i[0]][i[1]]);
        }
        return l;        
    }
}