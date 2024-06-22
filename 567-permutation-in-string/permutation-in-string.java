class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int n=s1.length();
        int m=s2.length();
        if(n>m) return false;
        int cnt[]=new int[26];
        for(int i=0;i<n;i++){
            cnt[s1.charAt(i)-'a']++;
            cnt[s2.charAt(i)-'a']--;
        }
        if(check(cnt)) return true;
        int j=0;
        for(int i=n;i<m;i++){
            cnt[s2.charAt(i)-'a']--;
            cnt[s2.charAt(j++)-'a']++;
            if(check(cnt)) return true;
        }
        return false;
    }
    public boolean check(int []cnt){
        for(int i=0;i<26;i++){
            if(cnt[i]!=0) return false;
        }
        return true;
    }
}