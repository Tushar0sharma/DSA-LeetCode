class Solution {
    public boolean isBipartite(int[][] graph) {
        int n=graph.length;
        int []color=new int[n];
        for(int i=0;i<n;i++){
            if(color[i]==0){
                if(dfs(i,graph,1,color)) return false; 
            }
        }
        return true;
    }
    public boolean dfs(int i,int [][]graph,int c,int []color){
        color[i]=c;
        for(int j:graph[i]){
            if(color[j]==0){
                int k=0;
                if(c==1) k=2;
                else k=1;
                if(dfs(j,graph,k,color)) return true;
            }
            else if(color[j]==c){
                return true;
            }
        }
        return false;
    }
}