class Solution {
    public int[][] updateMatrix(int[][] mat) {
        Queue<int[]>q=new LinkedList<>();
        int n=mat.length;
        int m=mat[0].length;
        int [][]vis=new int[n][m];
        for(int []i:vis) Arrays.fill(i,Integer.MAX_VALUE);
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(mat[i][j]==0){vis[i][j]=0; q.add(new int[]{i,j,0});}
            }
        }
        int [][]dir={{0,1},{1,0},{-1,0},{0,-1}};
        while(!q.isEmpty()){
            int []p=q.poll();
            for(int []i:dir){
                int nr=i[0]+p[0];
                int nc=i[1]+p[1];
                if(nr>=0 &&nc<m &&nr<n &&nc>=0 &&vis[nr][nc]>1+p[2]){
                    vis[nr][nc]=p[2]+1;
                    q.add(new int[]{nr,nc,p[2]+1});
                }
            }
        }
        return vis;
    }
}