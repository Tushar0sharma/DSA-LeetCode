class Solution {
    public List<Integer> findMinHeightTrees(int n, int[][] edges) {
        if(n==1) return Collections.singletonList(0);
        
        List<List<Integer>>ll=new ArrayList<>();
        int []deg=new int[n];
        for(int i=0;i<n;i++) ll.add(new ArrayList<>());
        for(int []i:edges){
            deg[i[0]]++;
            deg[i[1]]++;
            ll.get(i[0]).add(i[1]);
            ll.get(i[1]).add(i[0]);
        }
        Queue<Integer>q=new LinkedList<>();
        for(int i=0;i<n;i++){
            if(deg[i]==1) q.add(i);
        }
        int processed=0;
        while(n-processed>2){
            int size=q.size();
            processed+=size;
            for(int i=0;i<size;i++){
                int w=q.poll();
                for(int l:ll.get(w)){
                    if(--deg[l]==1) q.add(l);
                }
            }
        }
        List<Integer>ans=new ArrayList<>();
        while(!q.isEmpty()) ans.add(q.poll());
        return ans;
    }
}