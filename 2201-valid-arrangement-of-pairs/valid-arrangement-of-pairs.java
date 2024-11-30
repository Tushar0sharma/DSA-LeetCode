class Solution {
    public int[][] validArrangement(int[][] pairs) {
        Map<Integer,Deque<Integer>>adj=new HashMap<>();
        Map<Integer,Integer>in=new HashMap<>();
        Map<Integer,Integer>out=new HashMap<>();

        for(int []i:pairs){
            in.put(i[1],in.getOrDefault(i[1],0)+1);
            out.put(i[0],out.getOrDefault(i[0],0)+1);
            adj.computeIfAbsent(i[0],k->new ArrayDeque<>()).add(i[1]);
        }

        int st=-1;
        for(int i:adj.keySet()){
            if(in.getOrDefault(i,0)+1==out.get(i)){
                st=i;
                break;
            }
        }
        if(st==-1) st=pairs[0][0];
        List<Integer>res=new ArrayList<>();
        call(res,adj,st);
        Collections.reverse(res);
        int [][]ans=new int[res.size()-1][2];
        for(int i=1;i<res.size();i++){
            ans[i-1]=new int[]{res.get(i-1),res.get(i)};
        }
        return ans;
    }
    public void call(List<Integer>l,Map<Integer,Deque<Integer>>adj,int st){
        Deque<Integer>d=adj.get(st);
        while(d!=null && !d.isEmpty()){
            call(l,adj,d.pollFirst());
        }
        l.add(st);
    }
}