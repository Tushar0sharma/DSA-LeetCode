class Solution {
    public String removeKdigits(String num, int k) {
        if(num.length()==k){
            return "0";
        }
        char[]digit=num.toCharArray();
        char[]stack=new char[num.length()];
        int stacktop=-1;
        int cnt=k;
        for(int i=0;i<digit.length;i++){
            while(cnt>0 && stacktop>=0 && stack[stacktop]>digit[i]){
                stacktop--;
                cnt--;
            }
            stacktop++;
            stack[stacktop]=digit[i];
        }
        int nonzero=0;
        while(stack[nonzero]=='0' && nonzero<digit.length-k-1){
            nonzero++;
        }
        
        return String.valueOf(stack,nonzero,digit.length-k-nonzero);
    }
}