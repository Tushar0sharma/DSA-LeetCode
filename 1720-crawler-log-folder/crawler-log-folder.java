class Solution {
    public int minOperations(String[] logs) {
        Stack<String>s=new Stack<>();
        for(String a:logs){
            if(!s.isEmpty() && a.equals("../")){
                s.pop();
            }
            else if(!a.equals("./") && !a.equals("../")){
                s.push(a);
            }
        }
        System.out.println(s);
        int cnt=0;
        while(!s.isEmpty()){
            cnt++;
            s.pop();
        }
        return cnt;
    }
}