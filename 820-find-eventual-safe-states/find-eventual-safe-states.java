class Solution {
    public List<Integer> eventualSafeNodes(int[][] graph) {
        List<List<Integer>>ll=new ArrayList<>();
        int n=graph.length;
        int []deg=new int[n];
        for(int i=0;i<n;i++) ll.add(new ArrayList<>());
        for(int i=0;i<n;i++){
            for(int it:graph[i]){
                 ll.get(it).add(i);
                 deg[i]++;
            }
        }
        return topo(deg,ll);
    }
    public List<Integer> topo(int[]deg,List<List<Integer>>ll){
        Queue<Integer>q=new LinkedList<>();
        int n=deg.length;
        for(int i=0;i<n;i++) if(deg[i]==0) q.add(i);
        List<Integer>ans=new ArrayList<>();
        while(!q.isEmpty()){
            int w=q.poll();
            ans.add(w);
            for(int i:ll.get(w)){
                if(--deg[i]==0) q.add(i);
            }
        }
        Collections.sort(ans);
        return ans;
    }
}