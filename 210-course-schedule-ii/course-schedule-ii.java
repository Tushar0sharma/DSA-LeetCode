class Solution {
    public int[] findOrder(int n, int[][] prerequisites) {
        List<List<Integer>>ll=new ArrayList<>();
        int []indeg=new int[n];
        for(int i=0;i<n;i++) ll.add(new ArrayList<>());
        for(int []i:prerequisites){
            ll.get(i[1]).add(i[0]);
            indeg[i[0]]++;
        }
        Queue<Integer>q=new LinkedList<>();
        for(int i=0;i<n;i++){
            if(indeg[i]==0) q.add(i);
        }
        int []ans=new int[n];
        int k=0;
        while(!q.isEmpty()){
            int p=q.poll();
            ans[k++]=p;
            for(int j:ll.get(p)){
                if(--indeg[j]==0){
                    q.add(j);
                }
            }
        }
        if(k!=n) return new int[]{};
        return ans;
    }
}