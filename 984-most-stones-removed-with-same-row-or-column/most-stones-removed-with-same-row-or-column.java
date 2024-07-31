class Solution {
    public int removeStones(int[][] stones) {
        int n=stones.length;
        int mr=0;
        int mc=0;
        for(int i=0;i<n;i++){
            mr=Math.max(mr,stones[i][0]);
            mc=Math.max(mc,stones[i][1]);
        }
        int []par=new int[mr+mc+2];
        int []rank=new int [mr+mc+2];
        for(int i=0;i<=mr+mc+1;i++){
            par[i]=i;
            rank[i]=1;
        }
        Set<Integer>s=new HashSet<>();
        for(int []i:stones){
            int noder=i[0];
            int nodec=i[1]+mr+1;
            union(noder,nodec,par,rank);
            s.add(noder);
            s.add(nodec);
        }
        int cnt=0;
        for(int i:s){
            if(find(i,par)==i) cnt++;
        }
        return n-cnt;
    }
    public int find(int u,int []par){
        if(par[u]==u) return u;
        return par[u]=find(par[u],par);
    }
    
    public void union(int u,int v,int []par,int []rank){
        int pu=find(u,par);
        int pv=find(v,par);

        if(pu==pv) return;

        if(rank[pu]>rank[pv]){
            rank[pu]+=rank[pv];
            par[pv]=pu;
        }
        else{
            rank[pv]+=rank[pu];
            par[pu]=pv;
        }
    }
}