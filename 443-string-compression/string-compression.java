class Solution {
    public int compress(char[] chars) {
        StringBuilder s=new StringBuilder();
        int idx=0;
        while(idx<chars.length){
            int cnt=0;
            char ch=chars[idx];
            while(idx<chars.length && ch==chars[idx]){
                cnt++;
                idx++;
            }
            if(cnt==1){
                s.append(ch);
            }
            else{
                s.append(ch).append(cnt);
            }
        }
        // System.out.println(s);
        int i=0;
        for(char c:s.toString().toCharArray()){
            chars[i++]=c;
        }
        return s.toString().length();
    }
}