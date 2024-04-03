class Solution {
    public String reverseOnlyLetters(String s) {
        if(s.length()==0 ||s.length()==1) return s;
        char[]ch=s.toCharArray();
        int i=0;
        int j=ch.length-1;
        while(i<=j){
            if( Character.isLetter(ch[i]) && Character.isLetter(ch[j]) ){
                char temp=ch[i];
                ch[i++]=ch[j];
                ch[j--]=temp;
            }
            if(!Character.isLetter(ch[i])){
                i++;
            }
            if(!Character.isLetter(ch[j])){
                j--;
            }
        }
        String k=new String(ch);
        return k;
    }
}