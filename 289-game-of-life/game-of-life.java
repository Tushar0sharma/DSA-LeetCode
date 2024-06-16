class Solution {
    public void gameOfLife(int[][] b) {
        for(int i=0;i<b.length;i++){
            for(int j=0;j<b[0].length;j++){
                int lives=liveNeighbour(b,i,j);
                if(b[i][j]==1 && lives>=2 && lives<=3){
                    b[i][j]=3;
                }
                if(b[i][j]==0 && lives==3){
                    b[i][j]=2;
                }
            }
        }
        for(int i=0;i<b.length;i++){
            for(int j=0;j<b[0].length;j++){
                b[i][j]>>=1;
            }
        }
    }
    public int liveNeighbour(int[][]b,int i,int j){
        int live=0;
        int n=b.length,m=b[0].length;
        for(int x=Math.max(i-1,0);x<=Math.min(i+1,n-1);x++){
            for(int y=Math.max(j-1,0);y<=Math.min(j+1,m-1);y++){
                live+=b[x][y]&1;
            }
        }
        live-=b[i][j]&1;
        return live;
    }
}