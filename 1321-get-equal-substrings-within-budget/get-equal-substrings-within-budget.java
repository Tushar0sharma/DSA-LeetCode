class Solution {
    public int equalSubstring(String s, String t, int maxCost) {
        int max=0;
        int start=0;
        int currcost=0;

        for(int i=0;i<s.length();i++){
            currcost+=Math.abs(s.charAt(i)-t.charAt(i));
            while(currcost>maxCost){
                currcost-=Math.abs(s.charAt(start)-t.charAt(start));
                start++;
            }
            max=Math.max(max,i-start+1);
        }
        return max;
    }
}