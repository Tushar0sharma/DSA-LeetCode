class Solution {
    public String largestOddNumber(String num) {
        StringBuilder a=new StringBuilder();
        boolean j=false;
        for(int i=num.length()-1;i>=0;i--){
            char ch=num.charAt(i);
            if(j || (ch-'0')%2!=0){
                j=true;
                a.insert(0,ch);
            }
        }
        return a.toString();
    }
}