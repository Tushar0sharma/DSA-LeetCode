class Solution {
    public int orangesRotting(int[][] grid) {
        Queue<int[]>q=new LinkedList<>();
        int n=grid.length;
        int m=grid[0].length;
        int a=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j]==2) q.add(new int[]{i,j});
                else if(grid[i][j]==1) a++;
            }
        }
        if(a==0) return 0;
        int [][]dir={{0,1},{-1,0},{1,0},{0,-1}};
        int ans=0;
        while(!q.isEmpty()){
            int s=q.size();
            ans++;
            for(int k=0;k<s;k++){
                int []p=q.poll();
                for(int[]i:dir){
                    int r=i[0]+p[0];
                    int c=i[1]+p[1];
                    if(r>=0 && c>=0 && r<n && c<m && grid[r][c]==1){
                        grid[r][c]=2;
                        a--;
                        q.add(new int[]{r,c});
                    }
                }
            }
        }
        if(a!=0) return -1;
        return ans-1;
    }
}