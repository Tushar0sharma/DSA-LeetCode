class Solution {
    public boolean checkValidString(String s) {
        Stack<Integer>st1=new Stack<>();
        int i=0;
        Stack<Integer>st2=new Stack<>();
        for(char ch:s.toCharArray())
        {
            if(ch=='(') st1.push(i);
            else if(ch=='*') st2.push(i);
            else{
                if(!st1.isEmpty()) st1.pop();
                else if(!st2.isEmpty()) st2.pop();
                else return false;
            }
            i++;
        }
        while(!st1.isEmpty()&&!st2.isEmpty()&&st1.peek()<st2.peek()){
            st1.pop();
            st2.pop();
        }
        return st1.isEmpty();
    }
}