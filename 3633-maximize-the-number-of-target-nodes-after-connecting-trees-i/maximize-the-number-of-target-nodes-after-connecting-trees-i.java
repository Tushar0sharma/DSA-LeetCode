class Solution {
    public int[] maxTargetNodes(int[][] edges1, int[][] edges2, int k) {
        int n=edges1.length;
        int m=edges2.length;   
        List<List<Integer>>ll1=new ArrayList<>();
        List<List<Integer>>ll2=new ArrayList<>();
        for(int i=0;i<=n;i++) ll1.add(new ArrayList<>());
        for(int i=0;i<=m;i++) ll2.add(new ArrayList<>());
        for(int []i:edges1){
            ll1.get(i[0]).add(i[1]);
            ll1.get(i[1]).add(i[0]);
        }
        for(int []i:edges2){
            ll2.get(i[0]).add(i[1]);
            ll2.get(i[1]).add(i[0]);
        }
        int []ans=new int[n+1];
        int []l1=new int[n+1];
        int max=Integer.MIN_VALUE;
        for(int i=0;i<=m;i++){
            max=Math.max(max,call(ll2,k-1,i));
        }
        for(int i=0;i<=n;i++){
            l1[i]=call(ll1,k,i)+max;
        }
        return l1;
    }
    public int call(List<List<Integer>>ll,int k,int st){
        Queue<Integer>q=new LinkedList<>();
        q.add(st);
        int cnt=0;
        boolean []vis=new boolean[ll.size()+1];
        vis[st]=true;
        while(!q.isEmpty() && k-->=0){
            int s=q.size();
            while(s-->0){
                cnt++;
                int p=q.poll();
                for(int kk:ll.get(p)){  
                    if(!vis[kk]){
                        vis[kk]=true;
                        q.add(kk);
                    }
                }
            }
        }
        return cnt;
    }
}