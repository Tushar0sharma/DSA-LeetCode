class Solution {
    public String longestWord(String[] words) {
        Set<String>s=new HashSet<>();
        for(String str:words) s.add(str);
        String res="";

        for(String st:words){
            boolean b=true;
            for(int i=1;i<=st.length();i++){
                String ss=st.substring(0,i);
                if(!s.contains(ss)) b=false;
            }
            if(b){
                if(res.length()<st.length()) res=st;
                else if(res.length()==st.length() && res.compareTo(st)>0) res=st;
            }
        } 
        return res;
    }
}