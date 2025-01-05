class Solution {
    Map<Character,Map<Character,Integer>>mp;
    Map<String,Long>cache;
    public long shiftDistance(String s, String t, int[] nextCost, int[] previousCost) {
        mp=new HashMap<>();
        cache=new HashMap<>();

        for(int i=0;i<26;i++){
            mp.put((char)('a'+i),new HashMap<>());
        }
        for(int i=0;i<25;i++){
            mp.get((char)('a'+i)).put((char)('a'+i+1),nextCost[i]);
        }
        mp.get('z').put('a',nextCost[25]);
        mp.get('a').put('z',previousCost[0]);
        for(int i=1;i<26;i++)
        {
            mp.get((char)('a'+i)).put((char)('a'+i-1),previousCost[i]);
        }
        long ans=0;
        for(int i=0;i<s.length();i++){
            ans+=call(s.charAt(i),t.charAt(i));
        }
        return ans;
    }
    public long call(char c,char t){
        if(c==t) return 0;
        if(cache.containsKey(c+","+t)){
            return cache.get(c+","+t);
        }
        PriorityQueue<long[]>pq=new PriorityQueue<>((a,b)->Long.compare(a[0],b[0]));
        Set<Character>vis=new HashSet<>();
        pq.add(new long[]{0,c});
        while(!pq.isEmpty()){
            long []p=pq.poll();
            char node=(char)p[1];
            if(node==t){ 
                cache.put(c+","+t,p[0]);
                return p[0];
            }
            if(vis.contains(node)) continue;
            vis.add(node);
            for(char m:mp.get(node).keySet()){
                int cost=mp.get(node).get(m);
                pq.add(new long[]{p[0]+cost,m});
            }
        }
        return -1;
    }
}