class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int []a=new int[26];
        int []b=new int[26];
        int n=s1.length();
        int m=s2.length();
        if(n>m) return false;
        for(int i=0;i<n;i++){
            a[s1.charAt(i)-'a']++;
            b[s2.charAt(i)-'a']++;
        }
        if(c(a,b)) return true;
        for(int i=n;i<m;i++){
            b[s2.charAt(i-n)-'a']--;
            b[s2.charAt(i)-'a']++;
            if(c(a,b)) return true;
        }
        return false;        
    }
    public boolean c(int []a,int []b){
        for(int i=0;i<26;i++) if(a[i]!=b[i]) return false;
        return true;
    }
}