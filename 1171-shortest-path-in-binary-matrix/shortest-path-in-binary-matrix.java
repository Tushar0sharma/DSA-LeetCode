class Pair{
    int row;
    int col;
    int k;
    Pair(int row,int col,int k){
        this.row=row;
        this.col=col;
        this.k=k;
    }
}
class Solution {
    int di=Integer.MAX_VALUE;
    public int shortestPathBinaryMatrix(int[][] grid) {
        if(grid[0][0]!=0 || grid[grid.length-1][grid[0].length-1]!=0) return -1;
        Queue<Pair>q=new LinkedList<>();
        q.add(new Pair(0,0,1)); int n = grid.length;
        int m = grid[0].length;
        boolean [][]vis=new boolean[n][m];
        while(!q.isEmpty()){
            int r=q.peek().row;
            int c=q.peek().col;
            int d=q.peek().k;
            if(r==grid.length-1 && c==grid[0].length-1){
                di=Math.min(di,d);
            }
            q.poll();
            int [][]direction = {{1,0}, {0,1}, {-1,0}, {0,-1}, {1,1}, {-1,-1}, {1,-1}, {-1,1}};
            for(int[] i:direction){
                int nr=r+i[0];
                int nc=c+i[1];
                if(nr >= 0 && nr < n && nc >= 0 && nc < m && grid[nr][nc] == 0 && !vis[nr][nc]){
                    q.add(new Pair(nr,nc,d+1));
                    vis[nr][nc]=true;
                }
            }
        }
        return di==Integer.MAX_VALUE?-1:di;
    }
}