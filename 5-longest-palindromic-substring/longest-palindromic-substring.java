class Solution {
    public String longestPalindrome(String s) {
        int maxlen=1;
        String max=s.substring(0,1);
        for(int i=0;i<s.length();i++){
            for(int j=i+maxlen;j<=s.length();j++){
                if(j-i>maxlen && pali(s.substring(i,j))){
                    maxlen=j-i;
                    max=s.substring(i,j);
                }
            }
        }
        return max;
    }
    public boolean pali(String s){
        int i=0;
        int j=s.length()-1;
        while(i<=j){
            if(s.charAt(i++)!=s.charAt(j--)){
                return false;
            }
        }
        return true;
    }
}