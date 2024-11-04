class Solution {
    public String compressedString(String s) {
        StringBuilder sb=new StringBuilder();
        int idx=0;
        while(idx<s.length()){
            char ch1=s.charAt(idx);
            int cnt=0;
            while(cnt<9 && idx<s.length() && s.charAt(idx)==ch1){
                cnt++;
                idx++;
            }
            sb.append(cnt).append(ch1);
        }
        return sb.toString();
    }
}