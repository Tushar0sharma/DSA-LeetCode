class Solution {
    public int largestIsland(int[][] grid) {
        int n=grid.length;
        int []par=new int[n*n];
        int []rank=new int[n*n];
        for(int i=0;i<n*n;i++){
            par[i]=i;
            rank[i]=1;
        }  
        int []r={0,0,1,-1};
        int []c={1,-1,0,0};      
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(grid[i][j]==1){
                    for(int k=0;k<4;k++){
                        int ni=i+r[k];
                        int nj=j+c[k];
                        if(ni>=0 && ni<n && nj>=0 && nj<n && grid[ni][nj]==1){
                            int node=i*n+j;
                            int adj=ni*n+nj;
                            union(node,adj,par,rank);
                        }
                    }
                }
            }
        }
        int max=0;

        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(grid[i][j]==0){
                    Set<Integer>s=new HashSet<>();
                    for(int k=0;k<4;k++){
                        int ni=i+r[k];
                        int nj=j+c[k];
                        if(ni>=0 && ni<n && nj>=0 && nj<n && grid[ni][nj]==1){
                            // int node=i*n+j;
                            int adj=ni*n+nj;
                            s.add(find(adj,par));
                        }
                    }
                    int cnt=1;
                    for(int g:s){
                        cnt+=rank[g];
                    }
                    max=Math.max(max,cnt);
                }
            }
        }
        return max==0?n*n:max;
    }
    public int find(int u,int []par){
        if(u==par[u]) return u;
        return par[u]=find(par[u],par);
    }
    public void union(int u,int v,int []par,int []rank){
        int pu=find(u,par);
        int pv=find(v,par);

        if(pu==pv) return ;
        if(rank[pu]>rank[pv]){
            rank[pu]+=rank[pv];
            par[pv]=pu;
        }
        else{
            par[pu]=pv;
            rank[pv]+=rank[pu];
        }
    }
}