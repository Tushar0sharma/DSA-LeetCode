class Solution {
    int cnt=0;
    public int countSubstrings(String s) {
        if(s.length()==0){
            return cnt;
        }
        for(int i=0;i<s.length();i++){
            palindrome(s,i,i);
            palindrome(s,i,i+1);
        }
        return cnt;
    }
    public void palindrome(String s,int i,int j){
        while(i>=0 && j<s.length() && s.charAt(i)==s.charAt(j)){
            cnt++; i--; j++;
        }
    }
}