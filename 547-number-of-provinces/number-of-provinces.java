class Solution {
    public int findCircleNum(int[][] isConnected) {
        List<List<Integer>>ll=new ArrayList<>();
        int n=isConnected.length;
        for(int i=0;i<n;i++) ll.add(new ArrayList<>());
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(isConnected[i][j]==0) continue;
                ll.get(i).add(j);
                ll.get(j).add(i);
            }
        }
        boolean[]vis=new boolean[n];
        int ans=0;
        for(int i=0;i<n;i++){
            if(!vis[i]) {
                ans++;
                dfs(i,vis,ll);
            }
        }
        return ans;
    }
    public void dfs(int i,boolean []vis,List<List<Integer>>ll){
        vis[i]=true;
        for(int j:ll.get(i)){
            if(!vis[j]){
                dfs(j,vis,ll);
            }
        }
    }
}