class Solution {
    public String minWindow(String s, String t) {
        Map<Character,Integer>mp1=new HashMap<>();
        for(char ch:t.toCharArray()){
            mp1.put(ch,mp1.getOrDefault(ch,0)+1);
        }
        String res="";
        int req=mp1.size();
        int l=0;
        int min=Integer.MAX_VALUE;
        int form=0;
        Map<Character,Integer>mp2=new HashMap<>();
        int r=0;
        while(r<s.length()){
            mp2.put(s.charAt(r),mp2.getOrDefault(s.charAt(r),0)+1);
            if(mp1.containsKey(s.charAt(r)) && mp1.get(s.charAt(r)).equals(mp2.get(s.charAt(r)))){
                form++;
            }
            while(req==form){
                int len=r-l;
                if(min>len){
                    min=len;
                    res=s.substring(l,r+1);
                }
                mp2.put(s.charAt(l),mp2.get(s.charAt(l))-1);
                if(mp1.containsKey(s.charAt(l)) && mp1.get(s.charAt(l))>mp2.get(s.charAt(l))){
                    form--;
                }
                l++;
            }
            r++;
        }
        return res;
    }
}