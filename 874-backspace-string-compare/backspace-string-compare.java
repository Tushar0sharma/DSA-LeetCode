class Solution {
    public boolean backspaceCompare(String s, String t) {
        Stack<Character>ss=new Stack<>();
        Stack<Character>st=new Stack<>();
        for(char ch:s.toCharArray()){
            if(!ss.isEmpty() &&ch=='#') ss.pop();
            else if(ss.isEmpty() && ch=='#') continue;
            else ss.push(ch);
        }
        for(char ch:t.toCharArray()){
            if(!st.isEmpty() && ch=='#') st.pop();
            else if(st.isEmpty() && ch=='#') continue;
            else st.push(ch);
        }
        while(!ss.isEmpty() && !st.isEmpty()){
            if(ss.pop()!=st.pop()) return false;
        }
        if(!ss.isEmpty() || !st.isEmpty()) return false;
        return true;
    }
}