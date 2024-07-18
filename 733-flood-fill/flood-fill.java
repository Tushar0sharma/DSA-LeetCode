class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int val=image[sr][sc];
        dfs(image,sr,sc,val,color);
        return image;
    }
    public void dfs(int[][] image, int i, int j,int val ,int color){
        if(i>=image.length || j>=image[0].length || i<0 || j<0 || image[i][j]!=val || image[i][j]==color){
            return ;
        }
        image[i][j]=color;
        dfs(image,i-1,j,val,color);
        dfs(image,i+1,j,val,color);
        dfs(image,i,j-1,val,color);
        dfs(image,i,j+1,val,color);
    }
}