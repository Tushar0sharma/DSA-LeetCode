class Solution {
    public String reverseWords(String s) {
        s=s.trim()+" ";
        int a=0;
        String word="";
        String ans="";
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)==' ' && a==0){
                ans=word+" "+ans;
                word="";
                a=1;
            }
            else if(s.charAt(i)!=' '){
                word+=s.charAt(i);
                a=0;
            }
        }
        return ans.trim();
    }
}