class Solution {
    public int getMaximumGold(int[][] grid) {
        boolean[][] path=new boolean[grid.length][grid[0].length];
        int sum=0;
        List<Integer>l=new ArrayList<>();
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]>0){
                    call(i,j,grid,l,path,sum);
                }
            }
        }
        if(l.size()==0) return 0;
        Collections.sort(l);

        return l.get(l.size()-1);
    }
    public void call(int row,int col,int[][]grid,List<Integer>l,boolean[][]path,int sum){
        if(row>=grid.length || col>=grid[0].length || row<0 || col<0 || path[row][col]==true || grid[row][col]==0){
            l.add(sum);
            return ;
        }
        int []r={1,0,-1,0};
        int []c={0,1,0,-1};
        path[row][col]=true;
        for(int i=0;i<r.length;i++){
            call(row+r[i],col+c[i],grid,l,path,sum+grid[row][col]);
        }
        path[row][col]=false;
        return ;
    }
}