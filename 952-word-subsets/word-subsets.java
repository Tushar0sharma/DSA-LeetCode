class Solution {
    public List<String> wordSubsets(String[] words1, String[] words2) {
        List<String>l=new ArrayList<>();
        Map<Character,Integer>mp=new HashMap<>();
        for(String s:words2){
            int []arr=new int [26];
            for(char ch:s.toCharArray()) {
                arr[ch-'a']++;    
                mp.put(ch,Math.max(arr[ch-'a'],mp.getOrDefault(ch,0)));
            }
        }
        int cnt=0;
        for(String s:words1){
            boolean b=false;
            Map<Character,Integer>ch=new HashMap<>();
            for(char c:s.toCharArray()) ch.put(c,ch.getOrDefault(c,0)+1);
            for(char c:mp.keySet()){
                if(!ch.containsKey(c) ||  ch.get(c)<mp.get(c)){
                    b=true;
                    break;
                }

            }
            if(!b) l.add(s);
        }
        return l;
    }
}