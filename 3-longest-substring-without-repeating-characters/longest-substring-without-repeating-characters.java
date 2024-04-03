class Solution {
    public int lengthOfLongestSubstring(String s) {
        //sliding window protocol
        int left=0;
        int max=0;
        Set<Character>l=new HashSet<>();
        for(int right=0;right<s.length();right++){
            while(l.contains(s.charAt(right))){
                l.remove(s.charAt(left));
                left++;
            }
            l.add(s.charAt(right));
            max=Math.max(max,right-left+1);
        }
        return max;
    }
}