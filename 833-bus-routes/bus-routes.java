class Solution {
    public int numBusesToDestination(int[][] routes, int src, int target) {
        if(src==target) return 0;

        Map<Integer,List<Integer>>mp=new HashMap<>();
        int n=routes.length;
        boolean flag=true;

        for(int i=0;i<routes.length;i++){
            for(int j:routes[i]){
                if(j==src) flag=false;
                if(!mp.containsKey(j))  mp.put(j,new ArrayList<>());
                mp.get(j).add(i);
            }
        }
        if(flag) return -1;

        Queue<Integer>q=new LinkedList<>();
        HashSet<Integer>vis=new HashSet<>();
        for(int i:mp.get(src)){
            q.add(i);
            vis.add(i);
        }
        int bus=1;
        while(!q.isEmpty()){
            int s=q.size();
            while(s-->0){
                int p=q.poll();
                for(int j:routes[p]){
                    if(j==target) return bus;
                    for(int next:mp.get(j)){
                        if(!vis.contains(next)){
                            vis.add(next);
                            q.add(next);
                        }
                    }
                }
            }
            bus++;
        }
        return -1;
    }
}