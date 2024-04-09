class Solution {
    static String []I={"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"};
    static String []X={"", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"};
    static String []C={"", "C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM"};
    static String M[] = {"", "M", "MM", "MMM"};
    
    
    public String intToRoman(int num) {
        return M[num/1000]+C[(num%1000)/100]+X[(num%100)/10]+I[(num%10)];
    }
}