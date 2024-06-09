class Solution {
    public String clearDigits(String s) {
        Stack<Character>st=new Stack<>();
        for(int i=0;i<s.length();i++){
            if(!Character.isDigit(s.charAt(i))){
                st.push(s.charAt(i));
            }
            else if(!s.isEmpty()){
                st.pop();
            }
        }
        String ss="";
        while(!st.isEmpty()){
            ss=st.pop()+ss;
        }
        return ss;
    }
}