class pair{
    String s;
    int v;
    pair(String s,int v){
        this.s=s;
        this.v=v;
    }
}
class Solution {
    public List<String> topKFrequent(String[] words, int k) {
        Map<String,Integer>mp=new HashMap<>();
        for(String s:words) mp.put(s,mp.getOrDefault(s,0)+1);
        PriorityQueue<pair>pq=new PriorityQueue<>((a,b)->a.v==b.v?a.s.compareTo(b.s):b.v-a.v);
        for(String ss:mp.keySet()){
            pq.add(new pair(ss,mp.get(ss)));
        }
        List<String>l=new ArrayList<>();
        for(int i=0;i<k;i++) l.add(pq.poll().s);
        return l;
    }
}