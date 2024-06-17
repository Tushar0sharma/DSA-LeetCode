class Solution {
    public int maximumLengthSubstring(String s) {
        int []freq=new int[128];
        int left=0;
        int max=0;
        for(int right=0;right<s.length();right++){
            freq[s.charAt(right)]++;
            while(freq[s.charAt(right)]==3){
                freq[s.charAt(left)]--;
                left++;
            }
            max=Math.max(right-left+1,max);
        }
        return max;
    }
}