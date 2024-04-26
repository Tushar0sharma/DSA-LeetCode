class Solution {
    static int total;
    public int myAtoi(String s) {
       total=0;
       if(s.length()==0) return 0;
       return call(s,0,true,false); 
    }
    public int call(String s,int i,boolean sign ,boolean num ){
        if(i>=s.length()) return 0;
        if(!num){
            if(s.charAt(i)==' ') return call(s,i+1,sign,num);
            if(s.charAt(i)=='+' || s.charAt(i)=='-'){
                sign=(s.charAt(i)=='-')?false:true;
                return call(s,i+1,sign,!num);
            }
        }
        num=true;
        char ch=s.charAt(i);
        if(ch-'0'<0 ||ch-'0'>9) return 0;
        if(total>Integer.MAX_VALUE/10 || (total==Integer.MAX_VALUE/10 && ch-'0'>7)){
            return sign?Integer.MAX_VALUE:Integer.MIN_VALUE;
        }
        total=total*10+ch-'0';
        int t=call(s,i+1,sign,num);
        if(t==0) return sign?total:-total;
        else return t;
    }
}