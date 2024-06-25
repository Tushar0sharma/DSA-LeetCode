class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer>st=new Stack<>();
        for(String s:tokens){
            if(s.equals("+")){
                int num1=st.pop();
                int num2=st.pop();
                st.push(num1+num2);
            }
            else if(s.equals("-")){
                int num1=st.pop();
                int num2=st.pop();
                st.push(num2-num1);
            }
            else if(s.equals("*")){
                int num1=st.pop();
                int num2=st.pop();
                st.push(num1*num2);
            }
            else if(s.equals("/")){
                int num1=st.pop();
                int num2=st.pop();
                st.push(num2/num1);
            }
            else{
                int num=Integer.valueOf(s);
                st.push(num);
            }
        }
        return st.pop();
    }
}