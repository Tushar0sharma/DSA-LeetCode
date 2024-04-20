class Solution {
    public int strStr(String s, String k) {
        for(int i=0;i<s.length();i++){
            if(check(s,i,k)){
                return i;
            }
        }
        return -1;
    }
    public boolean check(String s,int i,String k){
        int j=0;
        while(j!=k.length()){
            if(i==s.length() || k.charAt(j)!=s.charAt(i)){
                return false;
            }
            j++;
            i++;
        }
        return true;
    }
}