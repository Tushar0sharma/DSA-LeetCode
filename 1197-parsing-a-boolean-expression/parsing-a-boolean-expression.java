class Solution {
    public boolean parseBoolExpr(String ex) {
        Stack<Character>s=new Stack<>();
        for(int i=0;i<ex.length();i++){
            if(ex.charAt(i)==')'){
                List<Character>l=new ArrayList<>();
                while(!s.isEmpty() && s.peek()!='('){
                    l.add(s.pop());
                }
                s.pop();
                char opr=s.pop();
                s.push(solve(opr,l));
            }
            else if(ex.charAt(i)==','){
                continue;
            }
            else{
                s.push(ex.charAt(i));
            }
        }
        char chh=s.pop();
        if(chh=='t') return true;
        return false;
    }
    public char solve(char opr,List<Character>l){
        if(opr=='&'){
            boolean f=false;
            for(char ch:l){ 
            if(ch=='f') {
                f=true;
                break;
            }
            }
            if(f) return 'f';
            return 't';
        }
        else if(opr=='|'){
            boolean f=false;
            for(char ch:l) {
                if(ch=='t') {
                    f=true;
                    break;
                }}
            if(f) return 't';
            return 'f';
        }
        else{
            char c=l.get(0);
            if(c=='t') return 'f';
            else return 't';
        }
    }
}