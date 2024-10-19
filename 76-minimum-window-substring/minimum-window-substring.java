class Solution {
    public String minWindow(String s, String t) {
        Map<Character,Integer>mp=new HashMap<>();
        for(char ch:t.toCharArray()){
            mp.put(ch,mp.getOrDefault(ch,0)+1);
        }
        int unique=mp.size();
        int j=0;
        Map<Character,Integer>mp1=new HashMap<>();
        int make=0;
        int min=Integer.MAX_VALUE;
        String ans="";
        for(int i=0;i<s.length();i++){
            mp1.put(s.charAt(i),mp1.getOrDefault(s.charAt(i),0)+1);
            if(mp.containsKey(s.charAt(i)) && mp1.get(s.charAt(i)).equals(mp.get(s.charAt(i)))){
                make++;
            }
            while(make==unique){
                int len=i-j;
                if(min>len){
                    ans=s.substring(j,i+1);
                    min=len;
                }
                mp1.put(s.charAt(j),mp1.getOrDefault(s.charAt(j),0)-1);
                if(mp.containsKey(s.charAt(j)) && mp.get(s.charAt(j))>mp1.get(s.charAt(j))){
                    make--;
                }
                j++;
            }
        }   
        return ans;
    }
}