class pair{
    int val;
    char ch;
    pair(char ch,int val){
        this.ch=ch;
        this.val=val;
    }
}
class Solution {
    public String reorganizeString(String s) {
        Map<Character,Integer>mp=new HashMap<>();
        for(char ch:s.toCharArray()) mp.put(ch,mp.getOrDefault(ch,0)+1);
        PriorityQueue<pair>pq=new PriorityQueue<>((a,b)->b.val-a.val);
        for(char ch:mp.keySet()) pq.add(new pair(ch,mp.get(ch)));
        String ans="";
        while(!pq.isEmpty()){
            pair p=pq.poll();
            if(ans.length()>0 && ans.charAt(ans.length()-1) == p.ch){
                if(pq.isEmpty()) return "";
                pair q=pq.poll();
                ans+=q.ch;
                if(q.val-1>0){
                    pq.add(new pair(q.ch,q.val-1));
                }
                pq.add(p);
            }
            else{
                ans+=p.ch;
                if(p.val-1>0){
                    pq.add(new pair(p.ch,p.val-1));
                }
            }
        }
        return ans;
    }
}