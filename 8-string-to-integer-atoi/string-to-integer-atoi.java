class Solution {
    public int myAtoi(String s) {
        int index=0;
        int sign=1;
        int total=0;
         if (s.length() == 0) return 0;
        while(index<s.length() && s.charAt(index)==' '){
            index++;
        }
        if(index<s.length() && (s.charAt(index)=='+' || s.charAt(index)=='-')){
            if(s.charAt(index)=='-'){
                sign=-1;
            }
            index++;
        }
        if (s.length() <index) {
            return 0;
        }

        while(index<s.length()){
            int digit=s.charAt(index)-'0';
            if(digit<0||digit>9) break;
             if(Integer.MAX_VALUE/10 < total || (Integer.MAX_VALUE/10 == total && digit>7) )
               return sign==1?Integer.MAX_VALUE:Integer.MIN_VALUE;
            total=total*10+digit;
            index++;
        }
     return total*sign;   
    }
}