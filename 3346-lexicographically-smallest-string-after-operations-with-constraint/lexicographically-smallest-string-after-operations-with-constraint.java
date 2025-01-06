class Solution {
    public String getSmallestString(String s, int k) {
        int n=s.length();
        char []ch=s.toCharArray();
        for(int i=0;i<n;i++){
            int dist=call(s.charAt(i),'a');
            if(dist<=k){
                ch[i]='a';
                k-=dist;
            }
            else if(k>0){
                ch[i]=(char)(ch[i]-k);
                k=0;
            }
        }
        return new String(ch);
    }
    public int call(char c,char a){
        int d=Math.abs(c-a);
        return Math.min(26-d,d);
    }
}