class Solution {
    public String reverseVowels(String s) {
        List<Character>l=new ArrayList<>();
        char[]ch=s.toCharArray();
        for(int i=0;i<s.length();i++){
            if(ch[i]=='A' ||ch[i]=='a' ||ch[i]=='E' ||ch[i]=='e' ||ch[i]=='i' ||ch[i]=='I' ||ch[i]=='o' ||ch[i]=='O' ||ch[i]=='u' ||ch[i]=='U' ) {
                l.add(ch[i]);
            }
        }
        Collections.reverse(l);
        int j=0;
        for(int i=0;i<s.length();i++){
            if(ch[i]=='A' ||ch[i]=='a' ||ch[i]=='E' ||ch[i]=='e' ||ch[i]=='i' ||ch[i]=='I' ||ch[i]=='o' ||ch[i]=='O' ||ch[i]=='u' ||ch[i]=='U' ){
                ch[i]=l.get(j++);
            }
        }
        return new String(ch);
    }
}