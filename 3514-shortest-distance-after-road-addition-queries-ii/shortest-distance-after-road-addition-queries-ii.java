class Solution {
    public int[] shortestDistanceAfterQueries(int n, int[][] queries) {
        int []ans=new int[queries.length];
        int k=0;
        Map<Integer,Integer>mp=new HashMap<>();
        for(int i=0;i<n-1;i++) mp.put(i,i+1);
        for(int i[]:queries){
            if(!mp.containsKey(i[0])|| mp.get(i[0])>=i[1]){
                ans[k++]=mp.size();
                continue;
            }
            var j=mp.get(i[0]);
            while(j<i[1]){
                j=mp.remove(j);
            }
            mp.put(i[0],i[1]);
            ans[k++]=mp.size();
        }
        return ans;        
    }
}