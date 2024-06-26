class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>>mp=new HashMap<>();
        if (strs == null || strs.length == 0)
        return new ArrayList<>();
        for(String s:strs){
            char[] chars=s.toCharArray();
            Arrays.sort(chars);
            String sort=new String(chars);

            if(!mp.containsKey(sort)){
                mp.put(sort,new ArrayList<>());
            }
            mp.get(sort).add(s);
        }
        return new ArrayList<>(mp.values());        
    }
}