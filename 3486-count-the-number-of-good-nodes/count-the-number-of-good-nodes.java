class Solution {
    int cnt;
    public int countGoodNodes(int[][] edges) {
        cnt=0;
        int n=edges.length+1;
        List<List<Integer>>ll=new ArrayList<>();
        for(int i=0;i<n;i++) ll.add(new ArrayList<>());
        for(int i[]:edges){
            ll.get(i[0]).add(i[1]);
            ll.get(i[1]).add(i[0]);
        }
        call(0,-1,ll);
        return cnt;
    }
    public int call(int node ,int par,List<List<Integer>>ll){
        int s=1;
        Set<Integer>l=new HashSet<>();
        for(int c:ll.get(node)){
            if(c==par) continue;
            int size=call(c,node,ll);
            l.add(size);
            s+=size;
        }
        if(l.size()<=1) cnt++;
        return s;
    }

}