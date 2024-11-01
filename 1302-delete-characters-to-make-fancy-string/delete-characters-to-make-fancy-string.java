class Solution {
    public String makeFancyString(String s) {
        StringBuilder sb=new StringBuilder();
        char l=s.charAt(0);
        sb.append(l);
        int cnt=1;
        for(int i=1;i<s.length();i++){
            if(l!=s.charAt(i)){
                l=s.charAt(i);
                sb.append(l);
                cnt=1;
            }
            else if(l==s.charAt(i)&& cnt<2){
                cnt++;
                sb.append(l);
            }
        }
        return sb.toString();
    }
}