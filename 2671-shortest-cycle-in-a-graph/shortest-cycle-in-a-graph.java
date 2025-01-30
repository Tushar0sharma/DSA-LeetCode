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
        Queue<int[]>q=new LinkedList<>();
        q.add(new int[]{src,-1});
        int ans=Integer.MAX_VALUE;
        int n=ll.size();
        int[]dist=new int[n];
        Arrays.fill(dist,Integer.MAX_VALUE);
        dist[src]=0;
        while(!q.isEmpty()){
            int[] p=q.poll();
            for(int i:ll.get(p[0])){
                if(dist[i]==Integer.MAX_VALUE){
                    dist[i]=dist[p[0]]+1;
                    q.add(new int[]{i,p[0]});
                }
                else if(p[1]!=i){
                    ans=Math.min(ans,dist[p[0]]+dist[i]+1);
                }
            }
        }
        return ans;
    }
}