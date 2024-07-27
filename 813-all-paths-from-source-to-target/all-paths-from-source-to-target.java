class Solution {
    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
        List<List<Integer>>ll=new ArrayList<>();
        Queue<List<Integer>>q=new LinkedList<>();
        q.add(Arrays.asList(0));
        while(!q.isEmpty()){
            List<Integer>path=q.poll();
            int curr=path.get(path.size()-1);
            if(curr==graph.length-1) ll.add(new ArrayList(path));
            for(int node:graph[curr]){
                List<Integer>l=new ArrayList(path);
                l.add(node);
                q.add(l);
            }
        }
        return ll;
    }
}