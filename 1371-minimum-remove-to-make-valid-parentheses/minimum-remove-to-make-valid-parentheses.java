class Solution {
    public String minRemoveToMakeValid(String s) {
        char []a=new char[s.length()];
        int cnt=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='('){
                cnt++;
            }
            else if(s.charAt(i)==')'){
                if(cnt==0){
                    a[i]='#';
                }
                else{
                    cnt--;
                }
            }
        }
        cnt=0;
        for(int i=s.length()-1;i>=0;i--){
            if(s.charAt(i)==')'){
                cnt++;
            }
            else if(s.charAt(i)=='('){
                if(cnt==0){
                    a[i]='#';
                }
                else{
                    --cnt;
                }
            }
        }
        String s1="";
        for(int i=0;i<a.length;i++){
            if(a[i]!='#'){
                s1=s1+s.charAt(i);
            }
        }
        return s1;
    }
}