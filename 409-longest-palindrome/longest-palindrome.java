class Solution {
    public int longestPalindrome(String s) {
        Map<Character,Integer>mp=new HashMap<>();
        int oddcnt=0;
        for(char ch:s.toCharArray()){
            mp.put(ch,mp.getOrDefault(ch,0)+1);
            if(mp.get(ch)%2==1){
                oddcnt++;
            }
            else{
                oddcnt--;
            }
        }
        if(oddcnt>1) return s.length()-oddcnt+1;
        return s.length();

    }
}