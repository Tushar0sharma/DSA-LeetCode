class Solution {
    public int minimumDiameterAfterMerge(int[][] edges1, int[][] edges2) {
        List<List<Integer>>l1=build(edges1);
        List<List<Integer>>l2=build(edges2);

        int dia1=getdia(l1);
        int dia2=getdia(l2);
        int a=(int)Math.ceil(dia1/2.0)+(int)Math.ceil(dia2/2.0)+1;
        return Math.max(Math.max(dia1,dia2),a);
    }
    public int getdia(List<List<Integer>>ll){
        int []first=find(ll,0);
        int[] sec=find(ll,first[1]);
        return sec[0];
    }
    public int[] find(List<List<Integer>>ll,int src){
        int farthest=src,max=0;
        Queue<Integer>q=new LinkedList<>();
        boolean[]vis=new boolean[ll.size()];
        vis[src]=true;
        q.add(src);
        while(!q.isEmpty()){
            int s=q.size();
            while(s-->0){
                int p=q.poll();
                farthest=p;
                for(int i:ll.get(p)){
                    if(!vis[i]){
                        vis[i]=true;
                        q.add(i);
                    }
                }
            }
            if(!q.isEmpty()) max++;
        }
        return new int[]{max,farthest};
    }
    public List<List<Integer>> build(int [][]edge){
        List<List<Integer>>ll=new ArrayList<>();
        int n=edge.length;
        for(int i=0;i<=n;i++) ll.add(new ArrayList<>());
        for(int []i:edge){
            ll.get(i[0]).add(i[1]);
            ll.get(i[1]).add(i[0]);
        }
        return ll;
    }
}