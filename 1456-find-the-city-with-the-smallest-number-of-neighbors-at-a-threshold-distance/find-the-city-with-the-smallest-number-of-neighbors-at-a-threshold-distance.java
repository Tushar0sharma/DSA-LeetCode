class Solution {
    public int findTheCity(int n, int[][] edges, int distanceThreshold) {
        int[][]mat=new int[n][n];
        for(int i=0;i<n;i++) Arrays.fill(mat[i],10001);
        for(int i=0;i<edges.length;i++){
            mat[edges[i][0]][edges[i][1]]=edges[i][2];
            mat[edges[i][1]][edges[i][0]]=edges[i][2];
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++) if(i==j) mat[i][j]=0;
        }

        for(int k=0;k<n;k++){
            for(int i=0;i<n;i++){
                for(int j=0;j<n;j++){
                    mat[i][j]=Math.min(mat[i][j],mat[i][k]+mat[k][j]);
                }
            }
        }
        int small=n;
        int city=0;
        for(int i=0;i<n;i++){
            int cnt=0;
            for(int j=0;j<n;j++){
                if(mat[i][j]<=distanceThreshold) cnt++;
            }
            if(cnt<=small){
                small=cnt;
                city=i;
            }
        }
        return city;
    }
}