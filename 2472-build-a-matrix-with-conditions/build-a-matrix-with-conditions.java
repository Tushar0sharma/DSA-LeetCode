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
        for(int []r:row){
            ll.get(r[0]).add(r[1]);
        }
        boolean []cycle={false};
        int []vis=new int[n+1];
        for(int i=1;i<=n;i++){
            if(vis[i]==0){
                dfs(vis,cycle,order,ll,i);
                if(cycle[0]) return new ArrayList<>();
            }
        }
        Collections.reverse(order);
        return order;
    }
    public void dfs(int[] vis,boolean[]cycle,List<Integer>order,List<List<Integer>>ll,int i){
        vis[i]=1;
        for(int k:ll.get(i)){
            if(vis[k]==0){
                dfs(vis,cycle,order,ll,k);
                if(cycle[0]) return;
            }
            else if(vis[k]==1){
                cycle[0]=true;
                return;
            }
        }
        vis[i]=2;
        order.add(i);
    }
}