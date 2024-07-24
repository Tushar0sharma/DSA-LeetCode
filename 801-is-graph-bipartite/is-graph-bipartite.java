class Solution {
    public boolean isBipartite(int[][] graph) {
        int[]vis=new int[graph.length];
        Arrays.fill(vis,-1);
        for(int i=0;i<vis.length;i++){
            if(vis[i]==-1){
                if(!dfs(i,graph,vis,0)) return false;
            }
        }
        return true;
    }
    public boolean dfs(int i,int[][]graph,int[]vis,int color){
        vis[i]=color;
        for(int k:graph[i]){
            if(vis[k]==-1){
                if(!dfs(k,graph,vis,1-color)) return false;
            }
            else if(vis[k]==color) return false;
        }
        return true;
    }
}