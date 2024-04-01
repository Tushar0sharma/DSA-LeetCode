class Solution {
    private final String[] belowtwenty={"", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine",
            "Ten", "Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen", "Eighteen", "Nineteen"};
    private final String[] above={"", "", "Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety"};
    public String numberToWords(int num) {
        if (num==0){
             return "Zero";
        }
        return helper(num);
    }
    public String helper(int num){
        StringBuilder res=new StringBuilder();
        if(num<20){
            res.append(belowtwenty[num]);
        }
        else if(num<100){
            res.append(above[num/10]).append(" ").append(belowtwenty[num%10]);
        }
        else if(num<1000){
            res.append(helper(num/100)).append(" Hundred ").append(helper(num%100));
        }
        else if(num<1000000){
            res.append(helper(num/1000)).append(" Thousand ").append(helper(num%1000));
        }
        else if(num<1000000000){
            res.append(helper(num/1000000)).append(" Million ").append(helper(num%1000000));
        }
        else{
            res.append(helper(num/1000000000)).append(" Billion ").append(helper(num%1000000000));
        }
        return res.toString().trim();
    }
}