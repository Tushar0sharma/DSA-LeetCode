class Solution {
    public int lengthOfLastWord(String s) {
        char[]ch=s.toCharArray();
        int cnt=0;
        for(int i=ch.length-1;i>=0;i--){
           if(ch[i]!=' '){
            cnt++;
           }
           else if(cnt!=0 && ch[i]==' '){
            break;
           }
        }
        return cnt;
    }
}