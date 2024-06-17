class Solution {
    public int countGoodSubstrings(String s) {
        int []freq=new int [126];
        int cnt=0;
        int dup=0;
        for(int right=0;right<s.length();right++){
            freq[s.charAt(right)]++;
            
            if(freq[s.charAt(right)]==2) dup++;
            if(right<2) continue;

            if(dup==0) cnt++;

            freq[s.charAt(right-2)]--;
            if(freq[s.charAt(right-2)]==1){
                dup--;
            }
        }
        return cnt;
    }
}