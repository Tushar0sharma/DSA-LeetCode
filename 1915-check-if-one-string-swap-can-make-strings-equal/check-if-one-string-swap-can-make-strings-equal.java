class Solution {
    public boolean areAlmostEqual(String s1, String s2) {
        char ch1='a';
        char ch2='a';
        char ch3='a';
        char ch4='a';
        int cnt=0;
        for(int i=0;i<s1.length();i++){
            if(s1.charAt(i)!=s2.charAt(i)){
                cnt++;
                if(cnt==1){
                    ch1=s1.charAt(i);
                    ch2=s2.charAt(i);
                }else if(cnt==2){
                    ch3=s1.charAt(i);
                    ch4=s2.charAt(i);
                }
                if(cnt>2) return false;
            }
        }
        return ch1==ch4&&ch2==ch3;
    }
}