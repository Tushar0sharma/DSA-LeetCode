class Solution {
    public int matrixScore(int[][] grid) {
        for(int i=0;i<grid.length;i++){
            if(grid[i][0]==0){
                for(int j=0;j<grid[0].length;j++){
                    if(grid[i][j]==0){
                        grid[i][j]=1;
                    }
                    else{
                        grid[i][j]=0;
                    }
                }
            }
            for(int j=1;j<grid[0].length;j++){
                int cnt1=0;
                int cnt2=0;
                for(int k=0;k<grid.length;k++){
                    if(grid[k][j]==0) cnt1++;
                    else cnt2++;    
                }
                if(cnt1>cnt2){
                    for(int k=0;k<grid.length;k++){
                        if(grid[k][j]==0) grid[k][j]=1;
                        else grid[k][j]=0;
                    }
                }
            }
        }
        for(int[] i:grid){
            for(int j:i){
                System.out.print(j+" ");
            }
            System.out.println();
        }
        int max=0;
        for(int i=0;i<grid.length;i++){
            int sum=0;
            int l=0;
            for(int j=grid[0].length-1;j>=0;j--){
                sum=sum + (int)Math.pow(2,l)*grid[i][j];
                l++;
            }
            max=max+sum;
        }
       return max; 
    }
}