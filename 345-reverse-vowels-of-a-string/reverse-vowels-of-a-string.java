class Solution {
    public String reverseVowels(String s) {
        // String str=s.toLower/Case();
        char[]ch=s.toCharArray();
        String s1="";
        for(int i=0;i<ch.length;i++){
            if(ch[i]=='a'||ch[i]=='e'||ch[i]=='o'||ch[i]=='i'||ch[i]=='u'||ch[i]=='A'||ch[i]=='E'||ch[i]=='O'||ch[i]=='I'||ch[i]=='U'){
               s1+=ch[i];
            }
        }
        StringBuilder s2=new StringBuilder(s1);
        s2.reverse();
        int k=0;
        for(int i=0;i<ch.length;i++){
            if(ch[i]=='a'||ch[i]=='e'||ch[i]=='o'||ch[i]=='i'||ch[i]=='u'||ch[i]=='A'||ch[i]=='E'||ch[i]=='O'||ch[i]=='I'||ch[i]=='U'){
               ch[i]=s2.charAt(k++);
            }
        }
        String s3=new String(ch);
        return s3;
    }
}