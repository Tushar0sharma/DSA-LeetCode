class Solution {
    private int time=0;
    public List<List<Integer>> criticalConnections(int n, List<List<Integer>> connections) {
        int []disc=new int[n];
        int []low=new int[n];
        List<List<Integer>>ll=new ArrayList<>();
        for(int i=0;i<n;i++) ll.add(new ArrayList<>());
        for(List<Integer>l:connections){
            ll.get(l.get(0)).add(l.get(1));
            ll.get(l.get(1)).add(l.get(0));
        }
        int []vis=new int[n];
        List<List<Integer>>ans=new ArrayList<>();
        dfs(0,-1,vis,disc,low,ll,ans);
        return ans;
    }
    public void dfs(int node,int par,int []vis,int []disc,int []low,List<List<Integer>>ll,List<List<Integer>>ans){
        vis[node]=1;
        disc[node]=low[node]=time;
        time++;

        for(Integer i:ll.get(node)){
            if(i==par) continue;
            if(vis[i]==0){
                dfs(i,node,vis,disc,low,ll,ans);
                low[node]=Math.min(low[node],low[i]);
                if(disc[node]<low[i]) ans.add(Arrays.asList(node,i));
            }
            else low[node]=Math.min(low[node],disc[i]);
        }
    }
}