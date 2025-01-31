class Solution {
    public int largestIsland(int[][] grid) {
        int n=grid.length;
        int []par=new int[n*n+1];
        int [][]dir={{1,0},{0,1},{-1,0},{0,-1}};
        int []size=new int[n*n+1];
        for(int i=0;i<n*n+1;i++){
            size[i]=1;
            par[i]=i;
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(grid[i][j]==1){
                    int row=i*n+j;
                    for(int k[]:dir){
                        int nr=k[0]+i;
                        int nc=k[1]+j;
                        int col=nr*n+nc;
                        if(nr>=0 && nr<n && nc>=0 && nc<n && grid[nr][nc]==1){
                            union(row,col,par,size);
                        }
                    }
                }
            }
        }
        int ans=0;
        
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(grid[i][j]==0){
                    Set<Integer>s=new HashSet<>();
                    for(int k[]:dir){
                        int nr=k[0]+i;
                        int nc=k[1]+j;
                        int col=nr*n+nc;
                        if(nr>=0 && nr<n && nc>=0 && nc<n && grid[nr][nc]==1){
                            s.add(find(par,col));
                        }
                    }
                    int jj=0;
                    for(int kk:s){
                        jj+=size[kk];
                    }
                    ans=Math.max(ans,jj+1);
                }
            }
        }
        System.out.println(Arrays.toString(par));
        System.out.println(Arrays.toString(size));
        return ans==0?n*n:ans;
    }
    public void union(int u,int v,int []par,int []size){
        int pu=find(par,u);
        int pv=find(par,v);
        if(pu==pv)return;
        if(size[pu]>size[pv]){
            size[pu]+=size[pv];
            par[pv]=pu;
        }
        else{
            size[pv]+=size[pu];
            par[pu]=pv;
        }
    }
    public int find(int []par,int p){
        if(par[p]==p) return p;
        return par[p]=find(par,par[p]); 
    }
}