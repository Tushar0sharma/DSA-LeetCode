class Solution {
    public List<String> findRepeatedDnaSequences(String s) {
        int i=0;
        int j=10;
        List<String>l=new ArrayList<>();
        Map<String,Integer>mp=new HashMap<>();
        while(j<=s.length()){
            String str=s.substring(i++,j++);
            mp.put(str,mp.getOrDefault(str,0)+1);

            if( mp.get(str)==2){
                l.add(str);
            }
        }
        return l;
    }
}