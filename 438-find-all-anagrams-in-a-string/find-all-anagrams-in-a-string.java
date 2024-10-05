class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer>l=new ArrayList<>();
        int []a=new int[26];
        int []b=new int[26];
        int n=p.length();
        int m=s.length();
        if(n>m) return new ArrayList<>();
        for(char c:p.toCharArray()) a[c-'a']++;
        int ll=0;

        for(int i=0;i<s.length();i++){
            b[s.charAt(i)-'a']++;
            if(i-ll+1==n){
                if(check(a,b)) l.add(ll);
            }
            if(i-ll+1>n){
                b[s.charAt(ll)-'a']--;
                ll++;
                if(check(a,b)) l.add(ll);
            }
        }
        return l;
    }
    public boolean check(int []a,int[]b){
        for(int i=0;i<26;i++) if(a[i]!=b[i]) return false;
        return true;
    }
}