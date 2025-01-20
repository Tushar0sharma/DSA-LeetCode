class Solution {
    public boolean isValid(String s) {
        Stack<Character>st=new Stack<>();
        for(char ch:s.toCharArray()){
            if(!st.isEmpty() && (ch=='}' ||ch==')' ||ch==']')){
                if(st.peek()=='{' && ch=='}') st.pop();
                else if(st.peek()=='[' && ch==']') st.pop();
                else if(st.peek()=='(' && ch==')') st.pop();
                else return false;
            }
            else st.push(ch);
        } 
        return st.isEmpty();
    }
}