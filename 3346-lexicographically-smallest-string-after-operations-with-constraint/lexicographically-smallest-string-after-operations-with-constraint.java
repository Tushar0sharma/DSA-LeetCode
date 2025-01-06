class Solution {
    public String getSmallestString(String s, int k) {
        int n=s.length();
        char []ch1=s.toCharArray();
        for(int i=0;i<n;i++){
            for(char ch='a';ch<='z';ch++){
                int dist=call(ch,s.charAt(i));
                if(dist<=k){
                    ch1[i]=ch;
                    k-=dist;
                    break;
                }
            }
        }
        return new String(ch1);
    }
    public int call(char c,char a){
        int d=Math.abs(c-a);
        return Math.min(26-d,d);
    }
}