class Solution {
    public String reverseWords(String s) {
        String a="";
        String word="";
        s=s.trim()+" ";
        int fg=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)==' ' && fg==0){
                a=word+" "+a;
                word="";
                fg=1;
            }
            else if(s.charAt(i)!=' '){
                word+=s.charAt(i);
                fg=0;
            }
        }
        return a.trim();
    }
}