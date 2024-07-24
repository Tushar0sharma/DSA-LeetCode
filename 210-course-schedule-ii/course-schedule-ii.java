class Solution {
    public int[] findOrder(int n, int[][] p) {
        List<List<Integer>>ll=new ArrayList<>();
        for(int i=0;i<n;i++) ll.add(new ArrayList<>());
        for(int[] i:p) {
            ll.get(i[1]).add(i[0]);
        }
        int[]vis=new int[n];
        boolean[]cycle={false};
        List<Integer>order=new ArrayList<>();
        for(int i=0;i<n;i++){
            if(vis[i]==0){
                dfs(vis,order,ll,cycle,i); 
                if(cycle[0]) return new int[0];
            }
        }
        int []ans=new int[n];
        // int k=0;
        for(int i:order){
            ans[--n]=i;
        }
        return ans;
    }
    public void dfs(int []vis,List<Integer>order,List<List<Integer>>ll,boolean[]cycle,int i){
        vis[i]=1;
        for(int k:ll.get(i)){
            if(vis[k]==0){
                dfs(vis,order,ll,cycle,k);
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