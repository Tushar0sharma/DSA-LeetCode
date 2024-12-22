class Solution {
    public int[] leftmostBuildingQueries(int[] a, int[][] queries) {
        int n=a.length;
        int qn=queries.length;
        List<List<int[]>>l=new ArrayList<>();
        for(int i=0;i<n;i++){
            l.add(new ArrayList<>());
        }
        PriorityQueue<int[]>pq=new PriorityQueue<>((va,b)->va[0]-b[0]); 
        int []ans=new int[qn];
        Arrays.fill(ans,-1);
        for(int i=0;i<qn;i++){
            int st=queries[i][0];
            int en=queries[i][1];

            if(st<en && a[st]<a[en]){
                ans[i]=en;
            }
            else if(st>en && a[st]>a[en]){
                ans[i]=st;
            }
            else if(st==en){
                ans[i]=st;
            }
            else{
                l.get(Math.max(st,en)).add(new int[]{Math.max(a[st],a[en]),i});
            }            
        }
        for(int i=0;i<n;i++){
            while(!pq.isEmpty() && pq.peek()[0]<a[i]){
                ans[pq.poll()[1]]=i;
            }
            for(int []q:l.get(i)) pq.add(q);
        }
        return ans;
    }
}