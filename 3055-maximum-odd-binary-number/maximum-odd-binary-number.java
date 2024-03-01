class Solution {
    public String maximumOddBinaryNumber(String s) {
        int ones=0;
        int zeros=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='1'){
                ones++;
            }else{
                zeros++;
            }
        }
        String s1="";
        for(int i=0;i<s.length();i++){
            if(i==0){
                s1='1'+s1;
                ones--;
            }
            else if(zeros==0){
               s1='1'+s1;
               ones--;
            }
            else{
              s1='0'+s1;
              zeros--;
            }
        }
        return s1;
    }
}