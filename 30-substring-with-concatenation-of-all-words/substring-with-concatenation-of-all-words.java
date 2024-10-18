class Solution {
    public List<Integer> findSubstring(String s, String[] words) {
        List<Integer>l=new ArrayList<>();
        Map<String,Integer>mp=new HashMap<>();
        for(String ss:words){
            mp.put(ss,mp.getOrDefault(ss,0)+1);
        }
        int wordlen=words[0].length();
        int len=words.length;
        int m=len*wordlen;
        int i=0;
        int j=0;
        while(j<s.length()){
            if(j-i+1==m){
                String sub=s.substring(i,j+1);
                Map<String,Integer>mp1=new HashMap<>();
                int p=0;
                while(p<sub.length()){
                    String t=sub.substring(p,p+wordlen);
                    mp1.put(t,mp1.getOrDefault(t,0)+1);
                    p+=wordlen;
                }
                if(mp.equals(mp1)){
                    l.add(i);
                }
                i++;
            }
            j++;
        }
        return l;
    }
}