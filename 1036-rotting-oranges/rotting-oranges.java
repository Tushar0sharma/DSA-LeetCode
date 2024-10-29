class Solution {
    public int orangesRotting(int[][] grid) {
        int n=grid.length;
        int m=grid[0].length;
        int [][]dp=new int[n][m];
        for(int []i:dp) Arrays.fill(i,Integer.MAX_VALUE);
        Queue<int[]>q=new LinkedList<>();
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j]==2){
                    q.add(new int[]{i,j,0});
                }
                if(grid[i][j]==0){
                    dp[i][j]=0;
                }
            }
        }
        while(!q.isEmpty()){
            int []p=q.poll();
            dp[p[0]][p[1]]=Math.min(dp[p[0]][p[1]],p[2]);
            int i=p[0];
            int j=p[1];
            if(i+1>=0 && j>=0 && i+1<n && j<m && grid[i+1][j]==1){
                grid[i+1][j]=2;
                q.add(new int[]{i+1,j,p[2]+1});
            }
            if(i-1>=0 && j>=0 && i-1<n && j<m && grid[i-1][j]==1){
                grid[i-1][j]=2;
                q.add(new int[]{i-1,j,p[2]+1});
            }
            if(i>=0 && j-1>=0 && i<n && j-1<m && grid[i][j-1]==1){
                grid[i][j-1]=2;
                q.add(new int[]{i,j-1,p[2]+1});
            }
            if(i>=0 && j+1>=0 && i<n && j+1<m && grid[i][j+1]==1){
                grid[i][j+1]=2;
                q.add(new int[]{i,j+1,p[2]+1});
            }
        }
        int max=0;
        for(int []i:dp){
            for(int j:i){
                if(j==Integer.MAX_VALUE) return -1;
                max=Math.max(max,j);
            } 
        }    
        return max;    
    }
}