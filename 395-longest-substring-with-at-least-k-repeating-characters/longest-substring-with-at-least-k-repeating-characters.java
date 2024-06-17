class Solution {
    public int longestSubstring(String s, int k) {
        int maxcnt=getmax(s);
        int []freq=new int[26];
        int max=0;

        for(int curr=1;curr<=maxcnt;curr++){
            Arrays.fill(freq,0);
            int windowstart=0,windowend=0,unique=0,cnt=0;
            while(windowend<s.length()){
                if(unique<=curr){
                    int idx=s.charAt(windowend)-'a';
                    if(freq[idx]==0) unique++;
                    freq[idx]++;
                    if(freq[idx]==k) cnt++;
                    windowend++;
                }
                else{
                    int idx=s.charAt(windowstart)-'a';
                    if(freq[idx]==k) cnt--;
                    freq[idx]--;
                    if(freq[idx]==0) unique--;
                    windowstart++;
                }
                if(unique==curr && unique==cnt){
                    max=Math.max(max,windowend-windowstart);
                }
            }
        }
        return max;
    }
    public int getmax(String s){
        int []freq=new int[26];
        int cnt=0;
        for(char ch:s.toCharArray()){
            if(freq[ch-'a']==0) cnt++;
            freq[ch-'a']++;
        }
        return cnt;
    }
}