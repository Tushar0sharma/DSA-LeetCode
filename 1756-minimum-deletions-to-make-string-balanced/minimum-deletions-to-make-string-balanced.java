class Solution {
    public int minimumDeletions(String s) {
        Stack<Character>st=new Stack<>();
        int a=0;
        for(int i=0;i<s.length();i++){
            if(!st.isEmpty() && s.charAt(i)=='a' && st.peek()=='b'){
                st.pop();
                a++;
            }
            else st.push(s.charAt(i));
        }
        return a;
    }
}