class Solution {
    public int[] loudAndRich(int[][] richer, int[] quiet) {
        Map<Integer,List<Integer>>mp=new HashMap<>();
        int n=quiet.length;
        int []ans=new int[n];
        for(int i=0;i<n;i++) mp.put(i,new ArrayList<>());
        for(int []i:richer) mp.get(i[1]).add(i[0]);
        System.out.println(mp);
        for(int i=0;i<n;i++){
            ans[i]=call(mp,quiet,i);
        }
        return ans;
    }
    public int call(Map<Integer,List<Integer>>mp,int[]qu,int src){
        int min=qu[src];
        Queue<Integer>q=new LinkedList<>();
        q.add(src);
        int ans=src;
        boolean []vis=new boolean[qu.length];
        while(!q.isEmpty()){
            int p=q.poll();
            for(int i:mp.get(p)){
                if(!vis[i]){
                    if(min>qu[i]){
                        min=qu[i];
                        ans=i;
                    }
                    vis[i]=true;
                    q.add(i);
                }
            }
        }
        return ans;
    }
}