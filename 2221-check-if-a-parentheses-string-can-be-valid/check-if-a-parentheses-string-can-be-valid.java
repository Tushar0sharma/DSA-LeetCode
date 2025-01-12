class Solution {
    public boolean canBeValid(String s, String locked) {
        if(s.length()%2!=0) return false;
        Stack<Integer>open=new Stack<>();
        Stack<Integer>star=new Stack<>();
        for(int i=0;i<s.length();i++){
            if(locked.charAt(i)=='0'){
                star.push(i);
            }
            else if(s.charAt(i)=='('){
                open.push(i);
            }
            else{
                if(!open.isEmpty()) open.pop();
                else if(!star.isEmpty()) star.pop();
                else return false;
            }
        }
        while(!open.isEmpty() && !star.isEmpty() && open.peek()<star.peek()){
            open.pop();
            star.pop();
        }
        if(!open.isEmpty()) return false;
        return true;
    }
}