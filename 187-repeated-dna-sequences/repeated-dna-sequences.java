class Solution {
    public List<String> findRepeatedDnaSequences(String s) {
        List<String>l=new ArrayList<>();
        Map<String,Integer>mp=new HashMap<>();
        int j=0;
        for(int i=10;i<=s.length();i++){
            String ss=s.substring(j++,i);
            mp.put(ss,mp.getOrDefault(ss,0)+1);
            if(mp.get(ss)==2){
                l.add(ss);
            }
        }
        return l;
    }
}