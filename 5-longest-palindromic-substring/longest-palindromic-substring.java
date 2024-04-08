class Solution {
    public String longestPalindrome(String s) {
        //expand from center
        String max=s.substring(0,1);
        for(int i=0;i<s.length();i++){
            String odd=expand(s,i,i);
            String even=expand(s,i,i+1);
            if(even.length()>max.length()){
                max=even;
            }
            if(odd.length()>max.length()){
                max=odd;
            }
        }
        return max;
    }
    public String expand(String s,int l,int r){
        while(l>=0 && r<s.length() && s.charAt(l)==s.charAt(r)){
            l--;
            r++;
        }
        return s.substring(l+1,r);
    }
}