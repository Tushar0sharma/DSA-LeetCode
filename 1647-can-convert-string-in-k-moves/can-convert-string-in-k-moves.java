class Solution {
    public boolean canConvertString(String s, String t, int k) {
        if(s.length()!=t.length()) return false;

        int []cnt=new int[26];
        for(int i=0;i<s.length();i++){
            int diff=(int)(t.charAt(i)-s.charAt(i));
            if(diff<0) diff=diff+26;

            if(diff>0 && diff+cnt[diff]*26 >k) return false;
            cnt[diff]++;
        }
        return true;
    }
}