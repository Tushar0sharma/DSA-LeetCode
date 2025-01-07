class Solution {
    public String shortestPalindrome(String s) {
        String rev=call(s);
        for(int i=0;i<s.length();i++){
            if(s.substring(0,s.length()-i).equals(rev.substring(i))) return rev.substring(0,i)+s;
        }
        return rev+s;
    }
    public String call(String s){
        StringBuilder sc=new StringBuilder(s);
        return sc.reverse().toString();
    }
}