class Solution {
    public String sortVowels(String s) {
        List<Character>l=new ArrayList<>();
        Set<Character>st=new HashSet<>();
        st.add('a');
        st.add('e');
        st.add('i');
        st.add('o');
        st.add('u');
        st.add('A');
        st.add('E');
        st.add('I');
        st.add('O');
        st.add('U');
        for(char ch:s.toCharArray()){
            if(st.contains(ch)) l.add(ch);
        }
        Collections.sort(l);
        int k=0;
        String ans="";
        for(char ch:s.toCharArray()){
            if(st.contains(ch)){
                ans+=l.get(k++);
            }
            else{
                ans+=ch;
            }
        }
        return ans;
    }
}