class Solution {
    int ans=-1;
    public int longestCycle(int[] edges) {
        int n=edges.length;
        int []cnt=new int[n];
        boolean []vis=new boolean[n];
        boolean []in=new boolean[n];
        Arrays.fill(cnt,1);
        for(int i=0;i<n;i++){
            if(!vis[i]){
                call(i,vis,cnt,edges,in);
            }
        }
        return ans;
    }
    public void call(int src,boolean[]vis,int[]cnt,int []edges,boolean[]in){
        int ne=edges[src];
        in[src]=true;
        vis[src]=true;
        if(ne!=-1 && !vis[ne]){
            cnt[ne]=cnt[src]+1;
            call(ne,vis,cnt,edges,in);
        }else if(ne!=-1 && in[ne]){
            ans=Math.max(ans,-cnt[ne]+cnt[src]+1);
        }
        in[src]=false;
    }
}