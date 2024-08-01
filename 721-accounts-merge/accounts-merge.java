class Solution {
    public List<List<String>> accountsMerge(List<List<String>> accounts) {
        Map<String,Integer>mp=new HashMap<>();
        int n=accounts.size();
        int []par=new int[n];
        int []rank=new int[n];
        for(int i=0;i<n;i++){
            rank[i]=1;
            par[i]=i;
        }
        for(int i=0;i<accounts.size();i++){
            for(int j=1;j<accounts.get(i).size();j++){
                if(!mp.containsKey(accounts.get(i).get(j))){
                    mp.put(accounts.get(i).get(j),i);
                }
                else{
                    union(i,mp.get(accounts.get(i).get(j)),par,rank);
                }
            }
        }
        List<String>[]merge=new ArrayList[n];
        for(int i=0;i<n;i++) merge[i]=new ArrayList<String>();
        for(String s:mp.keySet()){
            int node=find(mp.get(s),par);
            merge[node].add(s);
        }
        List<List<String>>ll=new ArrayList<>();
        for(int i=0;i<n;i++){
            if(merge[i].size()==0) continue;
            Collections.sort(merge[i]);
            List<String>temp=new ArrayList<>();
            temp.add(accounts.get(i).get(0));
            for(String s:merge[i]){
                temp.add(s);
            }
            ll.add(temp);
        }
        return ll;
    }
    public int find(int u,int []par){
        if(u==par[u]) return u;
        return par[u]=find(par[u],par);
    }
    public void union(int u,int v,int []par,int []rank){
        int pu=find(u,par);
        int pv=find(v,par);
        if(pv==pu) return;

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