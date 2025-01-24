class Solution {
    public List<Integer> eventualSafeNodes(int[][] graph) {
        List<Integer>l=new ArrayList<>();
        int n=graph.length;
        int []in=new int[n];
        Map<Integer,List<Integer>>mp=new HashMap<>();
        for(int i=0;i<n;i++) mp.put(i,new ArrayList<>());
        int []out=new int[n];
        for(int i=0;i<n;i++){
            for(int j:graph[i]){
                out[i]++;
                in[j]++;
                mp.get(j).add(i);
            }
        }
        // System.out.println(Arrays.toString(out));
        System.out.println(mp);
        
        Queue<Integer>q=new LinkedList<>();
        for(int i=0;i<n;i++) if(out[i]==0) q.add(i);
        // System.out.println(q);
        while(!q.isEmpty()){
            int p=q.poll();
            l.add(p);
            for(int i:mp.get(p)){
                if(--out[i]==0) q.add(i);
            }
        }
        Collections.sort(l);
        return l;
    }
}