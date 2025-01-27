class Solution {
    public List<Boolean> checkIfPrerequisite(int n, int[][] prerequisites, int[][] queries) {
        List<Boolean>l=new ArrayList<>();
        Map<Integer,List<Integer>>mp=new HashMap<>();
        for(int i=0;i<n;i++) mp.put(i,new ArrayList<>());
        boolean [][]reach=new boolean[n][n];
        for(int[]i:prerequisites){
            mp.get(i[0]).add(i[1]);
        }
        // System.out.println(mp);
        Queue<Integer>q=new LinkedList<>();
        for(int i=0;i<n;i++){
            bfs(reach,i,q,mp);
        }
        for(int[]i:queries){
            l.add(reach[i[0]][i[1]]);
        }
        return l;
    }
    public void bfs(boolean[][]reach,int src,Queue<Integer>q,Map<Integer,List<Integer>>mp){
        q.add(src);
        boolean []vis=new boolean[reach.length];
        vis[src]=true;
        while(!q.isEmpty()){
            int p=q.poll();
            reach[src][p]=true;
            for(int i:mp.get(p)){
                if(!vis[i]){    
                    vis[i]=true;
                    q.add(i);
                }
            }
        }
    }
}