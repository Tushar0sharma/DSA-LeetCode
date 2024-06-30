class Solution {
    public int minInsertions(String s) {
        Stack<Character>st=new Stack<>();
        int cnt=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='('){
                st.push(s.charAt(i));
            }
            else{
                if(i+1<s.length() && s.charAt(i+1)==')') i++;
                else cnt++;

                if(!st.isEmpty()) st.pop();
                else cnt++;
            }
        }
        cnt+=(st.size()*2);
        return cnt;
    }
}