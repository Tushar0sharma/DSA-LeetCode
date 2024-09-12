class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        int []a=new int[26];
        for(char c:allowed.toCharArray()) a[c-'a']++;
        int ans=0;
        for(String s:words){
            boolean f=true;
            for(char ch:s.toCharArray()){
                if(a[ch-'a']==0){
                    f=false;
                    continue;
                }
            }
            if(f) ans++;
        }
        return ans;
    }
}