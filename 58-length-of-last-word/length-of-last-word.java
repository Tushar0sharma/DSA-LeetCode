class Solution {
    public int lengthOfLastWord(String s) {
        char[] ch=s.toCharArray();
        int cnt=0;
        int flag=0;
        for(int i=ch.length-1;i>=0;i--){
            if(ch[i]!=' ' && flag==0) flag=1;
            if(ch[i]==' '&& flag!=0){
                break;
            }
            else if(ch[i]!=' ') cnt++;
        }
        return cnt;
    }
}