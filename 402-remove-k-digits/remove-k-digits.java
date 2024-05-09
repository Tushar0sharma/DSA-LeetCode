class Solution {
    public String removeKdigits(String num, int k) {
        char []digit=num.toCharArray();
        Stack<Character>s=new Stack<>();
        if(num.length()==k) return "0";
        int cnt=k;
        for(int i=0;i<digit.length;i++){
            while(cnt>0 && !s.isEmpty() && s.peek()>digit[i]){
                s.pop();
                cnt--;
            }
            s.push(digit[i]);
        }
        while(cnt>0){
            s.pop();
            cnt--;            
        }
        
        StringBuilder sb = new StringBuilder();
        while(!s.isEmpty())
            sb.append(s.pop());
        sb.reverse();
        
        while(sb.length()>1 && sb.charAt(0)=='0')
            sb.deleteCharAt(0);
        return sb.toString();
    }
}