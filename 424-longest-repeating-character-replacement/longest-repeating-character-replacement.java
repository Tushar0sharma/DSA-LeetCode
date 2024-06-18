class Solution {
    public int characterReplacement(String s, int k) {
        int max=0;
        int left=0;
        int mostfreq=0;
        int []freq=new int[128];
        for(int right=0;right<s.length();right++){
            freq[s.charAt(right)]++;
            mostfreq=Math.max(mostfreq,freq[s.charAt(right)]);
            int lettertochange=(right-left+1)-mostfreq;
            if(lettertochange>k){
                freq[s.charAt(left)]--;
                left++;
            }
            max=Math.max(max,right-left+1);
        }
        return max;
    }
}