class Solution {
    public int minSwaps(String s) {
        Stack<Character>st=new Stack<>();
        for(char ch:s.toCharArray()){
            if(ch=='[') st.push(ch);
            else{
                if(!st.isEmpty() && st.peek()=='[') st.pop();
                else st.push(ch);
            }
        }
        int swap=st.size()/2;
        return (swap+1)/2;
    }
}