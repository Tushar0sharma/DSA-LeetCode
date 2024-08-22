class Solution {
    public int findComplement(int num) {
        String n1="";
        while(num>0){
            n1=(num%2)+n1;
            num/=2;
        }
        System.out.println(n1);
        String s1="";
        for(int i=0;i<n1.length();i++){
            if(n1.charAt(i)=='0') s1+='1';
            else s1+='0'; 
        }
        return Integer.parseInt(s1,2);
    }
}