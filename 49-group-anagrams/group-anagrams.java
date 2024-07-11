class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>>mp=new HashMap<>();
        for(String s:strs){
            char[]c=new char[26];
            for(char ch:s.toCharArray()) c[ch-'a']++;
            String k=new String(c);
            if(!mp.containsKey(k)) mp.put(k,new ArrayList<>());
            mp.get(k).add(s);
        }
        return new ArrayList<>(mp.values());
    }
}