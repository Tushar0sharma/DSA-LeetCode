class Solution {
    public String minWindow(String s, String t) {
        Map<Character,Integer>mp1=new HashMap<>();
        Map<Character,Integer>mp2=new HashMap<>();
        for(char ch:t.toCharArray()){
            mp2.put(ch,mp2.getOrDefault(ch,0)+1);
        }
        String ans="";
        int j=0;
        int unique=mp2.size();
        int make=0;
        int min=Integer.MAX_VALUE;
        for(int i=0;i<s.length();i++){
            mp1.put(s.charAt(i),mp1.getOrDefault(s.charAt(i),0)+1);
            if(mp2.containsKey(s.charAt(i)) && mp1.get(s.charAt(i)).equals(mp2.get(s.charAt(i)))){
                make++;
            }
            while(make==unique){
                int len=i-j;
                if(min>len){
                    min=len;
                    ans=s.substring(j,i+1);
                }
                mp1.put(s.charAt(j),mp1.get(s.charAt(j))-1);
                if(mp2.containsKey(s.charAt(j)) && mp2.get(s.charAt(j))>mp1.get(s.charAt(j))){
                    make--;
                }
                j++;
            }
        }
        return ans;
    }
}