class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set<Character>st=new HashSet<>();
        int j=0;
        int max=0;
        for(int i=0;i<s.length();i++){
            while(st.contains(s.charAt(i))){
                st.remove(s.charAt(j));
                j++;
            }
            max=Math.max(max,i-j+1);
            st.add(s.charAt(i));
        }
        return max;
    }
}