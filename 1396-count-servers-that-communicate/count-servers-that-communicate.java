class Solution {
    public int countServers(int[][] grid) {
        int n=grid.length;
        int m=grid[0].length;
        Map<Integer,Integer>r=new HashMap<>();
        Map<Integer,Integer>c=new HashMap<>();
        int cnt=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j]==1){
                    r.put(i,r.getOrDefault(i,0)+1);
                    c.put(j,c.getOrDefault(j,0)+1);
                }
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j]==1 &&(r.get(i)>1 || c.get(j)>1)) cnt++;
            }
        }
        return cnt;
    }
}