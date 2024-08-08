class Solution {
    public int[][] spiralMatrixIII(int rows, int cols, int rstart, int cstart) {
        int [][]dir={{0,1},{1,0},{0,-1},{-1,0}};
        int [][]ans=new int[rows*cols][2];
        int len=rows*cols;
        ans[0]=new int[]{rstart,cstart};
        if(len==1) return ans;
        int dist=0;
        int row=rstart;
        int col=cstart;
        int diridx=0;
        int cnt=1;
        while(cnt<len){
            if(diridx==0 || diridx==2) dist++;

            for(int i=1;i<=dist;i++){
                row+=dir[diridx][0];
                col+=dir[diridx][1];
                if(row>=0 && col>=0 && row<rows && col<cols){
                    ans[cnt++]=new int[]{row,col};
                    if(cnt==len) return ans;
                }
            }
            diridx=(diridx+1)%4;
        }
        return ans;        
    }
}