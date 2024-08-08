class Solution {
    public int[][] spiralMatrixIII(int rows, int cols, int x, int y) {
        int[] []res=new int[rows*cols][2];
        int dx=0;
        int dy=1;
        int n=0;
        for(int i=0;i<rows*cols;++n){
            for(int j=0;j<n/2+1;j++){
                if(x>=0 && y>=0 && x<rows && y<cols)
                res[i++]=new int[]{x,y};
                x+=dx;
                y+=dy;
            }
            int temp=dx;
            dx=dy;
            dy=-temp;
        }
        return res;
    }
}