class Solution {
    enum state{
        safe,
        unsafe
    }
    public List<Integer> eventualSafeNodes(int[][] graph) {
        List<Integer>l=new ArrayList<>();
        int n=graph.length;
        state[]s=new state[n];
        for(int node=0;node<n;node++){
            if(issafe(graph,node,s)){
                l.add(node);
            }
        }
        return l;
    }
    public boolean issafe(int[][]graph,int node,state[]s){
        if(s[node]!=null) return s[node]==state.safe;
        s[node]=state.unsafe;
        for(int i:graph[node]){
            if(!issafe(graph,i,s)) return false;
        }
        s[node]=state.safe;
        return true;
    }
}