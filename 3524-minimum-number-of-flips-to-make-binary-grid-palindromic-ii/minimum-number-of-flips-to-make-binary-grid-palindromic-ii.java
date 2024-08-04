class Solution {
    public int minFlips(int[][] grid) {
        int n=grid.length;
        int m=grid[0].length;
        int ans=0;
        for(int i=0;i<n/2;i++){
            for(int j=0;j<m/2;j++){
                int x=grid[i][j];
                x+=grid[n-i-1][j];
                x+=grid[i][m-j-1];
                x+=grid[n-i-1][m-j-1];
                ans+=Math.min(4-x,x);
            }
        }
        int c=0;
        int cnt=0;
        if(m%2!=0){
            for(int i=0;i<n/2;i++){
                if(grid[i][m/2]!=grid[n-i-1][m/2]){
                    ans++;
                    cnt++;
                }
                if(grid[i][m/2]==grid[n-i-1][m/2] && grid[i][m/2]==1) c++;
            }
        }
        if(n%2!=0){
            for(int i=0;i<m/2;i++){
                if(grid[n/2][i]!=grid[n/2][m-i-1]){
                    ans++;
                    cnt++;
                }
                if(grid[n/2][i]==grid[n/2][m-i-1]&& grid[n/2][i]==1) c++;
            }
        }
        if(c%2!=0 && cnt==0) ans+=2;
        if(n%2==1 && m%2==1 && grid[n/2][m/2]==1) ans++;
        return ans;
    }
}