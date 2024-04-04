class Solution {
    public int hammingDistance(int x, int y) {
        String s1=call(x);
        String s2=call(y);
        if(s1.length()!=s2.length()){
            if(s1.length()<s2.length()){
                s1=put(s1,s2.length()-s1.length());
            }
            else{
                s2=put(s2,s1.length()-s2.length());
            }
        }
        System.out.println(s1);
        System.out.println(s2);
        int cnt=0;
        for(int i=0;i<s1.length();i++){
            if(s1.charAt(i)!=s2.charAt(i)) cnt++;
        }
        return cnt;
    }
    public String put(String s1,int r){
        for(int i=0;i<r;i++){
            s1=0+s1;
        }
        return s1;
    }
    public String call(int n){
        String b=""; 
        while(n!=0){
            int num=n%2;
            b=num+b;
            n=n/2;
        }
        return b;
   }
}