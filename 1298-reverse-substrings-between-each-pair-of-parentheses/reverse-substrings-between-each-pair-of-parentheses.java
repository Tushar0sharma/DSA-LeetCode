class Solution {
    public String reverseParentheses(String s) {
        Stack<Character>st=new Stack<>();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)==')'){
                String a="";
                while(st.peek()!='('){
                    a+=st.pop();
                }
                st.pop();
                for(int k=0;k<a.length();k++){
                    st.push(a.charAt(k));
                }
            }
            else st.push(s.charAt(i));
        }
        String ans="";
        while(!st.isEmpty()){
            ans=st.pop()+ans;
        }
        return ans;
    }
}