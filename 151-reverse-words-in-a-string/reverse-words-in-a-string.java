class Solution {
    public String reverseWords(String s) {
        s=s.trim()+" ";
        String word="";
        String ans="";
        boolean ch=false;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)!=' '){
                word+=s.charAt(i);
                ch=true;
            }
            else if(ch) {
                ans=word+" "+ans;
                word="";
                ch=false;
            }
        }
        return ans.trim();
    }
}