class Solution {
    public String removeOccurrences(String s, String part) {
        Stack<Character>st=new Stack<>();
        int n=part.length();
        for(char ch:s.toCharArray()){
            boolean b=true;
            if(ch==part.charAt(n-1)){
                Stack<Character>ss=new Stack<>();
                int i=2;
                while(!st.isEmpty() && n-i>=0 && part.charAt(n-i)==st.peek()){
                    ss.push(st.pop());
                    i++;
                }
                if(i!=n+1){
                    while(!ss.isEmpty()){
                        st.push(ss.pop());
                    }
                } 
                else b=false;
            }
            if(b)
            st.push(ch);
        }
        String ans="";
        while(!st.isEmpty()){
            ans=st.pop()+ans;
        }
        return ans;
    }
}