class Solution {
    public int countServers(int[][] grid) {
        int n=grid.length;
        int m=grid[0].length;
        int []par=new int[n+m+1];
        int []size=new int[n+m+1];
        for(int i=0;i<n+m+1;i++){
            par[i]=i;
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j]==1){
                    int row=i;
                    int col=j+n;
                    union(row,col,par,size);
                }
            }
        }
        System.out.println(Arrays.toString(size));
        int cnt=0;
        for(int i=0;i<n+m+1;i++){
            if(size[i]>1 && par[i]==i) cnt+=size[i];
        }
        return cnt;
    }
    public int find(int p,int []par){
        if(p==par[p]) return p;
        return par[p]=find(par[p],par);
    }
    public void union(int u,int v,int []par,int []size){
        int pu=find(u,par);
        int pv=find(v,par);
        if(pu==pv){
            size[pu]++;
            return;
        }
        if(size[pu]>size[pv]){
            size[pu]+=size[pv]+1;
            par[pv]=pu;
        }
        else{
            size[pv]+=size[pu]+1;
            par[pu]=pv;
        }
    }
}