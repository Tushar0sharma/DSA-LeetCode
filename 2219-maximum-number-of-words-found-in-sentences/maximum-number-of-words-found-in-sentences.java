class Solution {
    public int mostWordsFound(String[] s) {
        int max=0;
        for(int i=0;i<s.length;i++){
            int cnt=1;
            for(int j=0;j<s[i].length();j++){
                if(s[i].charAt(j)==' '){
                    cnt++;
                }
            }
            max=Math.max(max,cnt);
        }
        return max;
    }
}