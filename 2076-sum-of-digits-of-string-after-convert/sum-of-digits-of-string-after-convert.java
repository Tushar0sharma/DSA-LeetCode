class Solution {
    public int getLucky(String s, int k) {
        int sum=0;
        String a="";
        for(int i=0;i<s.length();i++){
            a+=s.charAt(i)-'a'+1;
        }
        String d=a;
        while(k-->0){
            int m=0;
            for(int i=0;i<d.length();i++){
                m+=d.charAt(i)-'0';
            }
            d=m+"";
            sum=m;
        }
        return sum;
    }
}