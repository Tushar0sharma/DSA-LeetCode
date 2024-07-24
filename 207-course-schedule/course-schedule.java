class Solution {
    public boolean canFinish(int n, int[][] p) {
        List<List<Integer>>ll=new ArrayList<>();
        int []deg=new int[n];
        for(int i=0;i<n;i++) ll.add(new ArrayList<>());
        for(int []i:p){
            ll.get(i[1]).add(i[0]);
            deg[i[0]]++;
        }
        List<Integer>order=new ArrayList<>();
        Queue<Integer>q=new LinkedList<>();
        for(int i=0;i<n;i++) if(deg[i]==0) q.add(i);
        while(!q.isEmpty()){
            int w=q.poll();
            order.add(w);
            for(int s:ll.get(w)){
                if(--deg[s]==0) q.add(s);
            }
        }
        return order.size()==n;
    }
}