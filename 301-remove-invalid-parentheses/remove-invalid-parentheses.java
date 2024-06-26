class Solution {
    public List<String> removeInvalidParentheses(String s) {
        Set<String>st=new HashSet<>();
        List<String>l=new ArrayList<>();
        int min=getmin(s);
        call(s,l,st,min);
        return l;
    }
    public void call(String s,List<String>l,Set<String>st,int min){
        if(st.contains(s)) return;

        st.add(s);
        if(min==0){
            int rem=getmin(s);
            if(rem==0) l.add(s);
            return;
        }
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)!='(' && s.charAt(i)!=')') continue;
            String ll=s.substring(0,i);
            System.out.println(ll.length());
            System.out.println(i);
            String r=s.substring(i+1);

            if(!st.contains(ll+r)) call(ll+r,l,st,min-1);

        }
    }
    public int getmin(String s){
        Stack<Character>st=new Stack<>();
        for(int i=0;i<s.length();i++){
            char x=s.charAt(i);

            if(x=='(') st.push(x);
            else if(x==')'){
                if(!st.isEmpty() && st.peek()=='(') st.pop();
                else st.push(x);
            }
        }
        return st.size();
    }
}