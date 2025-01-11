class Solution {
    public boolean canConstruct(String s, int k) {
        if(s.length()<k) return false;
        int []ch=new int[26];
        for(char c:s.toCharArray()){
            ch[c-'a']++;
        }
        for(int i:ch){
            if(i%2!=0) k--;
        }
        return k>=0;
    }
}