class Solution {
    public String decodeString(String s) {
        int idx=0;
        Stack<String>resst=new Stack<>();
        Stack<Integer>st=new Stack<>();
        String res="";
        while(idx<s.length()){
            if(Character.isDigit(s.charAt(idx))){
                int cnt=0;
                while(Character.isDigit(s.charAt(idx))){
                    cnt=cnt*10+(s.charAt(idx)-'0');
                    idx++;
                }
                st.push(cnt);
            }
            else if(s.charAt(idx)=='['){
                resst.push(res);
                res="";
                idx++;
            }
            else if(s.charAt(idx)==']'){
                StringBuilder temp=new StringBuilder(resst.pop());
                int repeat=st.pop();
                while(repeat-->0){
                    temp.append(res);
                }
                res=temp.toString();
                idx++;
            }
            else{
                res+=s.charAt(idx++);
            }
        }
        return res;        
    }
}