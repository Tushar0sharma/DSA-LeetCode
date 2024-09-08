class Solution {
    public int countServers(int[][] grid) {
        int n=grid.length;
        int m=grid[0].length;
        int []par=new int[n+m+1];
        int []size=new int[n+m+1];
        for(int i=0;i<par.length;i++){
            par[i]=i;
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j]==1){
                    int r=i;
                    int c=j+n;
                    union(r,c,par,size);
                }
            }
        }
        System.out.println("Parent Array: " + Arrays.toString(par));
        System.out.println("Size Array: " + Arrays.toString(size));
        int cnt=0;
        for(int i=0;i<par.length;i++){
            if(par[i]==i){
                if(size[i]>1) cnt+=size[i];
            }
        }
        return cnt;
    }
    public int find(int u,int []par){
        if(u==par[u]) return u;
        return par[u]=find(par[u],par);
    }
    public void union(int u,int v,int []par,int []size){
        int pu=find(u,par);
        int pv=find(v,par);
        if(pu==pv){
            size[pu]++;
            return;
        }
        if(size[pu]>size[pv]){
            par[pv]=pu;
            size[pu]+=(size[pv]+1);
        }
        else{
            par[pu]=pv;
            size[pv]+=(size[pu]+1);
        }
    }
}