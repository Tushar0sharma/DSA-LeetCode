class Solution {
    int a=0;
    public int maximumGain(String s, int x, int y) {
        if(x>y){
            s=removeAB(s,x);
            s=removeBA(s,y);
        }
        else{
            s=removeBA(s,y);
            s=removeAB(s,x);
        }
        return a;
    }
    public String removeBA(String s,int y){
        Stack<Character>st=new Stack<>();
        for(int i=0;i<s.length();i++){
            if(!st.isEmpty() && (s.charAt(i)=='a' && st.peek()=='b')) {
                st.pop();
                a+=y;
            }
            else{
                st.push(s.charAt(i));
            }
        }
        StringBuilder ans=new StringBuilder();
        while(!st.isEmpty()) ans.append(st.pop());
        ans.reverse();
        return ans.toString();
    }
    public String removeAB(String s,int x){
        Stack<Character>st=new Stack<>();
        for(int i=0;i<s.length();i++){
            if(!st.isEmpty() && (s.charAt(i)=='b' && st.peek()=='a')) {
                st.pop();
                a+=x;
            }
            else{
                st.push(s.charAt(i));
            }
        }
        StringBuilder ans=new StringBuilder();
        while(!st.isEmpty()) ans.append(st.pop());
        ans.reverse();
        return ans.toString();
    }
}