class Solution {
    public String largestOddNumber(String num) {
        String ans="";
        boolean b=false;
        for(int i=num.length()-1;i>=0;i--){
            int a=num.charAt(i)-'0';
            if(a%2!=0) b=true;
            if(b){
                ans=num.charAt(i)+ans;
            }
        }
        return ans;
    }
}