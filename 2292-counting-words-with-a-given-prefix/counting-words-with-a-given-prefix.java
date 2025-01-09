class Solution {
    public int prefixCount(String[] words, String pref) {
        int a=0;
        for(String s:words){
            if(s.startsWith(pref)) a++;
        }
        return a;
    }
}