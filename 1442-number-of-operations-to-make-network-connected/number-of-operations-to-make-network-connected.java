class Solution {
    public int makeConnected(int n, int[][] connections) {
        if(n-1>connections.length) return -1;
        int ans=0;
        List<List<Integer>>ll=new ArrayList<>();
        for(int i=0;i<n;i++) ll.add(new ArrayList<>());
        for(int[]i:connections){
            ll.get(i[0]).add(i[1]);
            ll.get(i[1]).add(i[0]);
        }
        // int ans=0;
        int[]vis=new int[n];
        for(int i=0;i<n;i++){
            if(vis[i]==0){
                ans++;
                dfs(i,ll,n,vis);
            }
        }
        return ans-1;
    }
    public void dfs(int i,List<List<Integer>>ll,int n,int[]vis){
        vis[i]=1;
        for(int k:ll.get(i)){
            if(vis[k]==0) dfs(k,ll,n,vis);
        }
    }
}