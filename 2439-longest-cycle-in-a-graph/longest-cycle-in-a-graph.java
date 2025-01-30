class Solution {
    public int longestCycle(int[] edges) {
        int n=edges.length;
        Queue<Integer>q=new LinkedList<>();
        int[]in=new int[n];
        for(int i=0;i<n;i++){
            if(edges[i]!=-1) in[edges[i]]++;
        }
        boolean[]vis=new boolean[n];
        for(int i=0;i<n;i++){
            if(in[i]==0) q.add(i);
        }
        while(!q.isEmpty()){
            int p=q.poll();
            vis[p]=true;
            int ne=edges[p];
            if(ne!=-1){
                if(--in[ne]==0) q.add(ne);
            }
        }
        int ans=-1;
        for(int i=0;i<n;i++){
            if(!vis[i]){
                int ne=edges[i];
                int cnt=1;
                vis[i]=true;
                while(ne!=i){
                    vis[ne]=true;
                    ne=edges[ne];
                    cnt++;
                }
                ans=Math.max(ans,cnt);
            }
        }
        return ans;
    }
}