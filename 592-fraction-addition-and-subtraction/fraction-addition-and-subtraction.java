class Solution {
    public String fractionAddition(String expr) {
        int num=0;
        int den=1;
        int n=expr.length();
        int i=0;
        while(i<n){
            int currnum=0;
            int currden=0;
            boolean neg=(expr.charAt(i)=='-');
            if(expr.charAt(i)=='+' || expr.charAt(i)=='-') i++;
            while(i<n && Character.isDigit(expr.charAt(i))){
                int val=expr.charAt(i)-'0';
                currnum=currnum*10+val;
                i++;
            }
            i++;
            while(i<n && Character.isDigit(expr.charAt(i))){
                int val=expr.charAt(i)-'0';
                currden=currden*10+val;
                i++;
            }
            if(neg) currnum*=-1;
            num=currnum*den+num*currden;
            den=currden*den;
        }if(num==0 || den==0){
            return "0/1";
        }

            int gcd=(call(Math.abs(num),Math.abs(den)));
            num/=gcd;
            den/=gcd;
            return ""+num+"/"+den;
    }
    
        public int call(int a,int b){
            int min=Math.min(a,b);
            while(min>0){
                if(a%min==0 && b%min==0) break;
                min--;
            }
            return min;
        }
}