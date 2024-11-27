class Solution {
    public int[] shortestDistanceAfterQueries(int n, int[][] queries) {
        Map<Integer,Integer>mp=new HashMap<>();
        for(int i=0;i<n-1;i++) mp.put(i,i+1);
        int []ans=new int[queries.length];
        for(int i=0;i<queries.length;i++){
            int st=queries[i][0];
            int en=queries[i][1];
            if(!mp.containsKey(st) || mp.get(st)>=en){
                ans[i]=mp.size();
                continue;
            }
            int j=mp.get(st);
            while(j<en){
                j=mp.remove(j);
            }
            mp.put(st,en);
            ans[i]=mp.size();
        }
        return ans;
    }
}