class Solution {
    public int findMaxFish(int[][] grid) {
        int n=grid.length;
        int m=grid[0].length;
        // int []par=new int[n+m+1];
        // int[]size=new int[n+m+1];
        // for(int i=0;i<n+m+1;i++){
        //     par[i]=i;
        //     size[i]=0;
        // } 
        int ans=0;   
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j]>0){
                    ans=Math.max(ans,call(i,j,grid));
                }
            }
        }
        return ans;

    }
    public int call(int i,int j,int [][]grid){
        Queue<int[]>q=new LinkedList<>();
        q.add(new int[]{i,j});
        int[][]dir={{1,0},{0,1},{-1,0},{0,-1}};
        int a=grid[i][j];
        grid[i][j]=0;
        int n=grid.length;
        int m=grid[0].length;

        // boolean[][]vis=new boolean[n][m];
        // vis[i][j]=true;
        while(!q.isEmpty()){
            int []p=q.poll();
            for(int ii[]:dir){
                int nr=p[0]+ii[0];
                int nc=p[1]+ii[1];
                if(nr>=0 && nr<n && nc>=0 && nc<m && grid[nr][nc]>0){
                    // vis[nr][nc]=true;
                    a+=grid[nr][nc];
                    grid[nr][nc]=0;
                    q.add(new int[]{nr,nc});
                }
            }
        }
        return a;

    }

}