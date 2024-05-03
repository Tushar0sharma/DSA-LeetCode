class Solution {
    public int compareVersion(String s1, String s2) {
        int num1=0;
        int num2=0;
        int i=0;
        int j=0;
        while(i<s1.length() || j<s2.length()){
            while(i<s1.length() && s1.charAt(i)!='.'){
                num1=num1*10+(s1.charAt(i)-'0');
                i++;
            }
            while(j<s2.length() && s2.charAt(j)!='.'){
                num2=num2*10+(s2.charAt(j)-'0');
                j++;
            }
            if(num1>num2) return 1;
            else if(num1<num2) return -1;
            num1=0;
            num2=0;
            i++;
            j++;
        }
        return 0;
    }
}