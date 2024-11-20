class Solution {
    public int takeCharacters(String s, int k) {
        int []cnt=new int[3];
        int max=0;
        int j=0;
        for(char ch:s.toCharArray()) cnt[ch-'a']++;
        if(cnt[0]<k || cnt[1]<k || cnt[2]<k) return -1;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            cnt[ch-'a']--;
            while(j<=i && (cnt[0]<k || cnt[1]<k || cnt[2]<k)){
                cnt[s.charAt(j)-'a']++;
                j++;
            }
            max=Math.max(max,i-j+1);
        }
        return s.length()-max;        
    }
}