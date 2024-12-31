class Solution {
    public int swimInWater(int[][] grid) {
        int ans=-1;
        int l=0;
        int n=grid.length;
        int r=n*n-1;
        while(l<=r){
            int mid=(l+r)/2;
            if(call(0,0,mid,new boolean[n][n],grid)){
                ans=mid;
                r=mid-1;
            }
            else l=mid+1;
        }
        return ans;
    }
    public boolean call(int i,int j,int mid,boolean [][]vis,int [][]grid){
        if(i<0 || j<0 || i>=grid.length || j>=grid[0].length || grid[i][j]>mid || vis[i][j]) return false;
        if(i==grid.length-1 && j==grid[0].length-1) return true;
        vis[i][j]=true;
        return call(i+1,j,mid,vis,grid)||call(i-1,j,mid,vis,grid)||call(i,j-1,mid,vis,grid)||call(i,j+1,mid,vis,grid);
    }
}