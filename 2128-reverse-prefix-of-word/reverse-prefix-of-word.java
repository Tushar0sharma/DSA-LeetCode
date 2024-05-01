class Solution {
    public String reversePrefix(String word, char d) {
        char[]ch=word.toCharArray();
        int idx=-1;
        for(int i=0;i<ch.length;i++){
            if(ch[i]==d){
                idx=i;
                break;
            }
        }
        if(idx==0 || idx==-1) return word;
        rev(ch,0,idx);
        String s=new String (ch);
        return s;
    }
    public void rev(char[]ch,int i,int j){
        while(i<j){
            char temp=ch[i];
            ch[i++]=ch[j];
            ch[j--]=temp;
        }
    }
}