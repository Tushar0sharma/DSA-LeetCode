class pair{
    int node;
    int weight;
    pair(int node,int weight){
        this.node=node;
        this.weight=weight;
    }
}
class Solution {
    public long minimumCost(String source, String target, char[] original, char[] changed, int[] cost) {
        List<List<int[]>>ll=new ArrayList<>();
        for(int i=0;i<26;i++) ll.add(new ArrayList<>());
        for(int i=0;i<cost.length;i++){
            ll.get(original[i]-'a').add(new int[]{changed[i]-'a',cost[i]});
        }
        int [][]dist=new int[26][26];
        for(int i=0;i<26;i++){
            for(int j=0;j<26;j++){
                if(i==j) dist[i][j]=0;
                else dist[i][j]=Integer.MAX_VALUE;
            }
        }
        for(int i=0;i<26;i++){
            bfs(i,ll,dist[i]);
        }
        long ans=0;
        for(int i=0;i<source.length();i++){
            if(source.charAt(i)!=target.charAt(i)){
                if(dist[source.charAt(i)-'a'][target.charAt(i)-'a']==Integer.MAX_VALUE) return -1;
                else ans+=dist[source.charAt(i)-'a'][target.charAt(i)-'a'];
            }
        }
        return ans;
    }
    public void bfs(int src,List<List<int[]>>ll,int []dist){
        PriorityQueue<pair>pq=new PriorityQueue<>((a,b)->a.weight-b.weight);
        pq.add(new pair(src,0));
        while(!pq.isEmpty()){
            pair p=pq.poll();
            int curr=p.node;
            int w=p.weight;
            for(int []i:ll.get(curr)){
                if(w+i[1]<dist[i[0]]){
                    dist[i[0]]=w+i[1];
                    pq.add(new pair(i[0],dist[i[0]]));
                }
            }
        }

    }
}