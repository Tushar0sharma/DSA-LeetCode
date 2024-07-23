class Solution {
    public int[][] buildMatrix(int k, int[][] rowConditions, int[][] colConditions) {
        List<Integer>l1=topo(k,rowConditions);
        List<Integer>l2=topo(k,colConditions);
        System.out.println(l1);
        System.out.println(l2);
        if(l1.isEmpty() || l2.isEmpty()) return new int[0][0];
        
        int [][]ans=new int[k][k];
        for(int i=0;i<k;i++){
            for(int j=0;j<k;j++){
                if(l1.get(i).equals(l2.get(j))){
                    ans[i][j]=l1.get(i);
                }
            }
        }
        return ans;        
    }
    public List<Integer> topo(int n,int [][]row){
        List<Integer>order=new ArrayList<>();
        List<List<Integer>>ll=new ArrayList<>();
        for(int i=0;i<=n;i++) ll.add(new ArrayList<>());
        int []deg=new int[n+1];
        for(int []r:row){
            ll.get(r[0]).add(r[1]);
            deg[r[1]]++;
        }
        Queue<Integer>q=new LinkedList<>();
        for(int i=1;i<=n;i++){
            if(deg[i]==0) q.add(i);
        }
        while(!q.isEmpty()){
            int w=q.poll();
            order.add(w);
            n--;
            for(int v:ll.get(w)){
                if(--deg[v]==0) q.add(v);
            }
        }
        if(n!=0) return new ArrayList<>();     
        return order;
    }
}