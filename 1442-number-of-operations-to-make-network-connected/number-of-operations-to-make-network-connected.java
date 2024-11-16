class Solution {
    public int makeConnected(int n, int[][] connections) {
        int m=connections.length;
        if(n-1>m) return -1;

        boolean []vis=new boolean[n];
        List<List<Integer>>ll=new ArrayList<>();
        for(int i=0;i<n;i++) ll.add(new ArrayList<>());
        for(int []i:connections){
            ll.get(i[0]).add(i[1]);
            ll.get(i[1]).add(i[0]);
        }
        int ans=0;
        for(int i=0;i<n;i++){
            if(!vis[i]){
                ans++;
                dfs(vis,ll,i);
            }
        }
        return ans-1;
    }
    public void dfs(boolean[]vis,List<List<Integer>>ll,int i){
        vis[i]=true;
        for(int j:ll.get(i)){
            if(!vis[j]){
                dfs(vis,ll,j);
            }
        }
    }
}