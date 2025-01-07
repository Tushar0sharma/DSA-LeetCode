class Solution {
    public int strStr(String h, String n) {
        return call(h,n);
    }
    public int call (String s,String pat){
        int i=0;
        int j=0;
        int n=s.length();
        int m=pat.length();
        int []lps=calllps(pat);
        while(i<n){
            if(s.charAt(i)==pat.charAt(j)){
                i++;
                j++;
                if(j==m) return i-m;
            }
            else{
                if(j>0) j=lps[j-1];
                else {
                    i++;
                }
            }
        }
        return -1;
    }
    public int [] calllps(String pat){
        int n=pat.length();
        int []lps=new int[n];
        lps[0]=0;
        int i=1;
        int len=0;
        while(i<n){
            if(pat.charAt(i)==pat.charAt(len)){
                len++;
                lps[i]=len;
                i++;
            }else{
                if(len>0) len=lps[len-1];
                else i++;
            }
        }
        return lps;
    }
}