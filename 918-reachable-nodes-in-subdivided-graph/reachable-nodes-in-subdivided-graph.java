class Solution {
    public int reachableNodes(int[][] edges, int maxMoves, int n) {
        int [][]graph=new int[n][n];
        for(int []i:graph){
            Arrays.fill(i,-1);
        }
        for(int []i:edges){
            graph[i[0]][i[1]]=i[2];
            graph[i[1]][i[0]]=i[2];
        }
        int ans=0;
        boolean[]vis=new boolean[n];
        PriorityQueue<int[]>pq=new PriorityQueue<>((a,b)->b[1]-a[1]);
        pq.add(new int[]{0,maxMoves});
        while(!pq.isEmpty()){
            int []a=pq.poll();
            int near=a[0];
            int remain=a[1];

            if(vis[near]) continue;
            vis[near]=true;
            ans++;
            for(int i=0;i<n;i++){
                if(graph[near][i]!=-1){
                    if(!vis[i] && remain>=graph[near][i]+1){
                        pq.add(new int[]{i,remain-graph[near][i]-1});
                    }
                    int moves=Math.min(remain,graph[near][i]);
                    graph[near][i]-=moves;
                    graph[i][near]-=moves;
                    ans+=moves;
                }
            }
        }
        return ans;
    }
}