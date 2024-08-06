class Pair{
    Character first;
    int freq;
    Pair(Character first,int freq){
        this.first=first;
        this.freq=freq;
    }
}
class Solution {
    public int minimumPushes(String word) {
        Map<Character,Integer>mp=new HashMap<>();
        for(char ch:word.toCharArray()){
            mp.put(ch,mp.getOrDefault(ch,0)+1);
        }
        PriorityQueue<Pair>pq=new PriorityQueue<>((a,b)->b.freq-a.freq);
        for(char i:mp.keySet()){
            int k=mp.get(i);
            pq.add(new Pair(i,k));
        }
        int k=1;
        int iter=0;
        int ans=0;
        System.out.println(mp);
        while(!pq.isEmpty()){
            iter++;
            if(iter==9) k++;
            if(iter==17) k++;
            if(iter==25) k++;
            Pair p=pq.poll();
            int j=p.freq;
            System.out.println(p.first);
            ans+=j*k;
        }
        return ans;
    }
}