class Solution {
    public int findTheLongestSubstring(String s) {
        Map<Character,Integer>mp=new HashMap<>(){
            {
            put('a',1);
            put('e',2);
            put('i',4);
            put('o',8);
            put('u',16);
            }
        };
        Map<Integer,Integer>m=new HashMap<>();
        int state=0;
        int max=0;
        m.put(0,-1);
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(mp.containsKey(ch)){
                state^=mp.get(ch);
            }
            m.putIfAbsent(state,i);
            max=Math.max(max,i-m.get(state));
        }
        return max;
    }
}