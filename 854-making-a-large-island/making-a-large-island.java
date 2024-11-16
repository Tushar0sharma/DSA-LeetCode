class Solution {
    public int largestIsland(int[][] grid) {
        int n=grid.length;
        int m=grid[0].length;
        int []par=new int[n*m+1];
        int []size=new int[n*m+1];
        for(int i=0;i<n*m+1;i++){
            par[i]=i;
            size[i]=1;
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j]==1){
                    int [][]dir={{0,1},{1,0},{0,-1},{-1,0}};
                    for(int []k:dir){
                        int nr=i+k[0];
                        int nc=k[1]+j;
                        int rr=i*n+j;
                        int cc=nr*n+nc;
                        if(nr>=0 && nr<n && nc>=0 && nc<m && grid[nr][nc]==1){
                            union(rr,cc,par,size);
                        }
                    }
                }
            }
        }
        int nas=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j]==0){
                    Set<Integer>s=new HashSet<>();
                    int [][]dir={{0,1},{1,0},{0,-1},{-1,0}};
                    for(int []k:dir){
                        int nr=i+k[0];
                        int nc=k[1]+j;
                        int rr=i*n+j;
                        int cc=nr*n+nc;
                        if(nr>=0 && nr<n && nc>=0 && nc<m && grid[nr][nc]==1){
                            s.add(find(cc,par));
                        }
                    }
                    int ans=0;
                    for(int jj:s){
                        ans+=size[jj];
                    }
                    nas=Math.max(nas,ans+1);
                }
            }
        }
        for(int i=0;i<n*n;i++){
            nas=Math.max(nas,size[i]);
        }
        return nas;
    }
    public int find(int p,int []par){
        if(p==par[p]) return p;
        return par[p]=find(par[p],par);
    }
    public void union(int u,int v,int []par,int []size){
        int pu=find(u,par);
        int pv=find(v,par);
        if(pu==pv) return;
        if(size[pu]>size[pv]){
            size[pu]+=size[pv];
            par[pv]=pu;
        }
        else {
            size[pv]+=size[pu];
            par[pu]=pv;
        }
    }
}