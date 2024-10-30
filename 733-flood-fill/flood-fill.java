class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int val=image[sr][sc];
        call(image,sr,sc,color,val);
        return image;
    }
    public void call(int [][]img,int sr,int sc,int nw,int c){
        if(sr<0 || sr>=img.length || sc<0 || sc>=img[0].length || img[sr][sc]!=c || img[sr][sc]==nw) return;
        img[sr][sc]=nw;
        call(img,sr+1,sc,nw,c);
        call(img,sr,sc-1,nw,c);
        call(img,sr,sc+1,nw,c);
        call(img,sr-1,sc,nw,c);
    }
}