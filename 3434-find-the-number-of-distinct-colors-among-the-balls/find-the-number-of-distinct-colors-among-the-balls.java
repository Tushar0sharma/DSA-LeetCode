class Solution {
    public int[] queryResults(int limit, int[][] queries) {
        Map<Integer,Integer>mp=new HashMap<>();
        Map<Integer,Integer>s=new HashMap<>();
        int n=queries.length;
        int[]ans=new int[n];
        for(int i=0;i<n;i++){
            int ball=queries[i][0];
            int color=queries[i][1];
            if(mp.containsKey(ball))
            {
                int last=mp.get(ball);
                s.put(last,s.get(last)-1);
                if(s.get(last)==0){
                    s.remove(last);
                }
            }
            s.put(color,s.getOrDefault(color,0)+1);
            mp.put(ball,color);
            ans[i]=s.size();
            // System.out.println(mp);
            // System.out.println(s);
        }
        return ans;
    }
}