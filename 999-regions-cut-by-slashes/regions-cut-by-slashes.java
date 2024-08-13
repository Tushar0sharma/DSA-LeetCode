class Solution {
    int cnt;
    public int regionsBySlashes(String[] grid) {
        cnt=0;
        int n=grid.length;
        int d=n+1;
        int []par=new int[d*d];
        int []rank=new int[d*d];
        for(int i=0;i<d*d;i++) {
            par[i]=i;
            rank[i]=1;
        }
        for(int i=0;i<d;i++){
            for(int j=0;j<d;j++){
                if(i==0 || j==0 || j==d-1 || i==d-1){
                    int c=i*d+j;
                    union(par,rank,0,c);
                }
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<grid[i].length();j++){
                if(grid[i].charAt(j)=='/'){
                    int a=(i+1)*d+j;
                    int b=(i)*d+(j+1);
                    union(par,rank,a,b);
                }
                else if(grid[i].charAt(j)=='\\'){
                    int a=(i)*d+j;
                    int b=(i+1)*d+(j+1);
                    union(par,rank,a,b);
                }
            }
        }
        return cnt;
    }
    public void union(int []par,int []rank, int u,int v){
        int pu=find(par,u);
        int pv=find(par,v);
        if(pu==pv){
            cnt++;
            return ;
        }
        if(rank[pu]>rank[pv]){
            rank[pu]+=rank[pv];
            par[pv]=pu;
        }
        else{
            rank[pv]+=rank[pu];
            par[pu]=pv;
        }
    }
    public int find(int []par,int u){
        if(u==par[u]) return u;
        return par[u]=find(par,par[u]);
    }
}