class Solution {
    int ans=-1;
    public void call(int []cnt,boolean in[],boolean[]vis,int src,int []edges){
        if(src!=-1){
            int ne=edges[src];
            in[src]=true;
            vis[src]=true;
            if(ne!=-1 && !vis[ne]){
                cnt[ne]=cnt[src]+1;
                call(cnt,in,vis,ne,edges);
            }
            else if(ne!=-1 && in[ne]){
                ans=Math.max(ans,cnt[src]-cnt[ne]+1);
            }
            in[src]=false;
        }
    }
    public int longestCycle(int[] edges) {
        int n=edges.length;
        boolean []vis=new boolean[n];
        boolean []inrecursion=new boolean[n];
        int []cnt=new int[n];
        Arrays.fill(cnt,1);
        for(int i=0;i<n;i++){
            if(!vis[i]) call(cnt,inrecursion,vis,i,edges);
        }
        return ans;
    }
}