class Solution {
    public int[] findRedundantConnection(int[][] edges) {
        int n=edges.length;
        int size[]=new int[n+1];
        int []par=new int[n+1];
        for(int i=0;i<=n;i++){
            par[i]=i;
            size[i]=1;
        }
        int []arr=new int[2];
        for(int i[]:edges) { 
            int pu = find(par, i[0]);
            int pv = find(par, i[1]);
            if(pu==pv){
                arr=i;
            }
            union(i[0],i[1],par,size);
        }
        return arr ;
    }
    public int find(int []par,int p){
        if(par[p]==p) return p;
        return par[p]=find(par,par[p]);
    }
    public void union(int u,int v,int []par,int []size){
        int pu=find(par,u);
        int pv=find(par,v);
        if(pu==pv) return ;
        if(size[pu]>size[pv]){
            size[pu]+=size[pv];
            par[pv]=pu;
        }
        else{
            size[pv]+=size[pu];
            par[pu]=pv;
        }
    }
}