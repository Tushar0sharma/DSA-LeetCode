class Solution {
    public int countCompleteComponents(int n, int[][] edges) {
        boolean []vis=new boolean[n];
        List<List<Integer>>ll=new ArrayList<>();
        for(int i=0;i<n;i++) ll.add(new ArrayList<>());
        for(int []i:edges){
            ll.get(i[0]).add(i[1]);
            ll.get(i[1]).add(i[0]);
        }
        int ans=0;
        for(int i=0;i<n;i++){
            int []edge=new int[1];
            int []vertex=new int[1];
            if(!vis[i]){
                bfs(edge,vertex,ll,vis,i);
                edge[0]=edge[0]/2;
                if(edge[0]==0) ans++;
                else if(vertex[0]*(vertex[0]-1)/2==edge[0]) ans++;
                System.out.println(edge[0]+" "+vertex[0]+" "+ans);
            }
        }
        return ans;
    }
    public void bfs(int []e,int []v,List<List<Integer>>ll,boolean[]vis,int i){
        Queue<Integer>q=new LinkedList<>();
        q.add(i);
        vis[i]=true;
        while(!q.isEmpty()){
            int n=q.poll();
            v[0]++;
            for(int j:ll.get(n)){
                e[0]++;
                if(!vis[j]){
                    vis[j]=true;
                    q.add(j);
                }
            }
        }
    }
}