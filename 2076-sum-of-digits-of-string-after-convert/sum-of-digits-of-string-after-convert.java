class Solution {
    public int getLucky(String s, int k) {
        int sum=0;
        String a="";
        for(int i=0;i<s.length();i++){
            a+=s.charAt(i)-96;
        }
        String d=a;
        System.out.println(d);
        while(k-->0){
            int m=0;
            for(int i=0;i<d.length();i++){
                System.out.println(Integer.valueOf(d.charAt(i)));
                m+=Integer.valueOf(d.charAt(i))-48;
            }
        System.out.println(m);
            d=m+"";
            sum=m;
        }
        return sum;
    }
}