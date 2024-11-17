class Solution {
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        int n=rooms.size();
        Queue<Integer>q=new LinkedList<>();
        q.add(0);
        boolean[]vis=new boolean[n];
        vis[0]=true;
        while(!q.isEmpty()){
            int node=q.poll();
            for(int i:rooms.get(node)){
                if(!vis[i]){
                    vis[i]=true;
                    q.add(i);
                }
            }
        }
        for(boolean b:vis) if(!b) return false;
        return true;
    }
}