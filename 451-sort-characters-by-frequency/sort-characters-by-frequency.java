class pair{
    int v;
    char ch;
    pair(char ch,int v){
        this.ch=ch;
        this.v=v;
    }
}
class Solution {
    public String frequencySort(String s) {
        Map<Character,Integer>mp=new HashMap<>();
        for(char ch:s.toCharArray()) mp.put(ch,mp.getOrDefault(ch,0)+1);
        PriorityQueue<pair>pq=new PriorityQueue<>((a,b)->b.v-a.v);
        String ans="";
        for(char c:mp.keySet()){
            pq.add(new pair(c,mp.get(c)));
        }
        while(!pq.isEmpty()){
            pair p=pq.poll();
            for(int i=0;i<p.v;i++){
                ans+=p.ch;
            }
        }
        return ans;
    }
}