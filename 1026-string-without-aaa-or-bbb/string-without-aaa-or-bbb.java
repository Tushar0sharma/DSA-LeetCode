class pair{
    int val;
    char ch;
    pair(int val,char ch){
        this.val=val;
        this.ch=ch;
    }
}
class Solution {
    public String strWithout3a3b(int a, int b) {
        PriorityQueue<pair>pq=new PriorityQueue<>((x,y)->y.val-x.val);
        if(a>0) pq.add(new pair(a,'a'));
        if(b>0) pq.add(new pair(b,'b'));

        StringBuilder ans=new StringBuilder();
        while(!pq.isEmpty()){
            pair p=pq.poll();
            if(ans.length()>1 && ans.charAt(ans.length()-1)==p.ch && ans.charAt(ans.length()-2)==p.ch){
                if(pq.isEmpty()) return ans.toString();
                pair q=pq.poll();
                ans.append(q.ch);
                if(q.val-1>0) pq.add(new pair(q.val-1,q.ch));
                pq.add(p);
            }
            else{
                ans.append(p.ch);
                if(p.val-1>0) pq.add(new pair(p.val-1,p.ch));
            }
        }        
        return ans.toString();
    }
}