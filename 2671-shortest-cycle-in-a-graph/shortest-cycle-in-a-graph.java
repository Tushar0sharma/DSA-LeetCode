class Solution {
    public int findShortestCycle(int n, int[][] edges) {
        int min=Integer.MAX_VALUE;
        List<List<Integer>>ll=new ArrayList<>();
        for(int i=0;i<n;i++) ll.add(new ArrayList<>());
        for(int i[]:edges){
            ll.get(i[0]).add(i[1]);
            ll.get(i[1]).add(i[0]);
        }
        for(int i=0;i<n;i++){
            min=Math.min(min,call(ll,i));
        }
        return min==Integer.MAX_VALUE?-1:min;
    }
    public int call(List<List<Integer>>ll,int src){
        Queue<Integer>q=new LinkedList<>();
        q.add(src);
        int ans=Integer.MAX_VALUE;
        int n=ll.size();
        int []par=new int[n];
        int[]dist=new int[n];
        Arrays.fill(dist,Integer.MAX_VALUE);
        Arrays.fill(par,-1);
        dist[src]=0;
        while(!q.isEmpty()){
            int p=q.poll();
            for(int i:ll.get(p)){
                if(dist[i]==Integer.MAX_VALUE){
                    dist[i]=dist[p]+1;
                    par[i]=p;
                    q.add(i);
                }
                else if(par[i]!=p && par[p]!=i){
                    ans=Math.min(ans,dist[p]+dist[i]+1);
                }
            }
        }
        return ans;
    }
}