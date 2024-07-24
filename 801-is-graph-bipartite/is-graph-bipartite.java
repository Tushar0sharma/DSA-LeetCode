class Solution {
    public boolean isBipartite(int[][] graph) {
        int[]vis=new int[graph.length];
        Arrays.fill(vis,-1);
        for(int i=0;i<vis.length;i++){
            if(vis[i]==-1){
                if(!bfs(i,graph,vis,0)) return false;
            }
        }
        return true;
    }
    public boolean bfs(int i,int[][]graph,int[]vis,int color){
        vis[i]=color;
        Queue<Integer>q=new LinkedList<>();
        q.add(i);
        while(!q.isEmpty()){
            int node=q.poll();
            for(int k:graph[node]){
            if(vis[k]==-1){
                vis[k]=1-vis[node];
                q.add(k);
            }
            else if(vis[node]==vis[k]) return false;
        }
        }
        return true;
    }
}