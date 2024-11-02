class Solution {
    public boolean isCircularSentence(String sentence) {
        String []s=sentence.split(" ");
        int n=s.length;
        for(int i=1;i<n;i++){
            if(s[i-1].charAt(s[i-1].length()-1) != s[i].charAt(0)) return false;
        }
        if(s[s.length-1].charAt(s[s.length-1].length()-1) != s[0].charAt(0)) return false;
        return true;
    }
}