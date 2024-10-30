class Solution {
    public int[][] updateMatrix(int[][] mat) {
        int n=mat.length;
        int m=mat[0].length;
        boolean [][]vis=new boolean[n][m];
        Queue<int[]>q=new LinkedList<>();
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(mat[i][j]==0){
                    vis[i][j]=true;
                    q.add(new int[]{i,j,0});
                }
            }
        }
        int []r={0,0,-1,1};
        int []c={1,-1,0,0};
        while(!q.isEmpty()){
            int []p=q.poll();
            mat[p[0]][p[1]]=p[2];
            for(int i=0;i<4;i++){
                int nr=p[0]+r[i];
                int nc=p[1]+c[i];
                if(nr>=0 && nc>=0 && nr<n && nc<m && !vis[nr][nc]){
                    vis[nr][nc]=true;
                    q.add(new int[]{nr,nc,p[2]+1});
                }
            }
        }
        return mat;
    }
}