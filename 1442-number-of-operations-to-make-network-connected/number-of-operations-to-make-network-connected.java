class Solution {
    public int makeConnected(int n, int[][] connections) {
        if(n-1>connections.length) return -1;
        int []par=new int[n];
        int []rank=new int[n];
        for(int i=0;i<n;i++){
            par[i]=i;
            rank[i]=1;
        }
        int ans=n;
        for(int []i:connections) ans-=union(i[0],i[1],par,rank);
        return ans-1;
    }
    public int union(int u,int v,int []par,int []rank){
        int pu=find(par,u);
        int pv=find(par,v);
        if(pu==pv) return 0;

        if(rank[pu]<rank[pv]){
            par[pu]=pv;
            rank[pv]+=rank[pu];
        }
        else{
            par[pv]=pu;
            rank[pu]+=rank[pv];
        }
        return 1;
    }
    public int find(int []par,int u){
        if(u==par[u]) return u;
        return par[u]=find(par,par[u]);
    }
}