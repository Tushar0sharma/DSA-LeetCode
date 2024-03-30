class Solution {
    public int minFlips(String target) {
        String s="0";
        int cnt=0;
        for(int i=0;i<target.length();i++){
            if(s.charAt(0)!=target.charAt(i)){
                cnt++;
                if(s=="1"){
                    s="0";
                }
                else{
                    s="1";
                }
            }
        }
        return cnt;
    }
}