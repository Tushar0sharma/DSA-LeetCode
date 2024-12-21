class Solution {
    int cnt=0;
    public int maxKDivisibleComponents(int n, int[][] edges, int[] values, int k) {
        List<List<Integer>>ll=new ArrayList<>();
        for(int i=0;i<n;i++) ll.add(new ArrayList<>());
        for(int []i:edges){
            ll.get(i[0]).add(i[1]);
            ll.get(i[1]).add(i[0]);
        }
        dfs(ll,values,k,0,-1);
        return cnt;
    }
    public long dfs(List<List<Integer>>ll,int []values,int k,int i,int par){
        long ans=values[i];
        for(int n:ll.get(i)){
            if(n!=par){
                ans+=dfs(ll,values,k,n,i);
            }
        }
        ans%=k;
        if(ans==0) cnt++;
        return ans;
    }
}