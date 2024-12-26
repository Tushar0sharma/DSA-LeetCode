class Solution {
    public String removeKdigits(String num, int k) {
        if(num.length()==k) return "0";
        char []digit=num.toCharArray();
        Stack<Character>s=new Stack<>();
        for(int i=0;i<num.length();i++){
            while(k>0 && !s.isEmpty() && s.peek()>digit[i]){
                s.pop();
                k--;
            }
            s.push(digit[i]);
        }
        while(k-->0) {
            s.pop();
        }
        StringBuilder sb=new StringBuilder();
        while(!s.isEmpty()){
            sb.append(s.pop());
        }
        sb.reverse();
        while(sb.length()>1 &&sb.charAt(0)=='0'){
            sb.deleteCharAt(0);
        }
        return sb.toString();



    }
}