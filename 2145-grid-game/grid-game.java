class Solution {
    public long gridGame(int[][] grid) {
        long topsum=0;
        for(int i:grid[0]){
            topsum+=i;
        }
        long bottomsum=0;
        long ans=Long.MAX_VALUE;
        int n=grid[0].length;
        for(int i=0;i<n;i++){
            topsum-=grid[0][i];
            ans=Math.min(ans,Math.max(bottomsum,topsum));
            bottomsum+=grid[1][i];
        }
        return ans;
    }
}