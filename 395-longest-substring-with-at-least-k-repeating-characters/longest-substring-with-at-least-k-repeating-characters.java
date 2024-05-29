class Solution {
    public int longestSubstring(String s, int k) {
        int maxuniquecnt=getmax(s);
        int freq[]=new int [26];
        int res=0;

        for(int curr=1;curr<=maxuniquecnt;curr++){
            int windowend=0,windowstart=0,uniquecnt=0,cntk=0;
            Arrays.fill(freq,0);

            while(windowend<s.length()){
                if(uniquecnt<=curr){
                    int idx=s.charAt(windowend)-'a';
                    if(freq[idx]==0){
                        uniquecnt++;
                    }
                    freq[idx]++;
                    if(freq[idx]==k){
                        cntk++;
                    }
                    windowend++;
                }
                else{
                    int idx=s.charAt(windowstart)-'a';
                    if(freq[idx]==k){
                        cntk--;
                    }
                    freq[idx]--;
                    if(freq[idx]==0){
                        uniquecnt--;
                    }
                    windowstart++;
                }

                if(uniquecnt==curr && uniquecnt==cntk){
                    res=Math.max(windowend-windowstart,res);
                }
            }
        }
        return res;
    }
    public int getmax(String s){
        int cnt=0;
        boolean []freq=new boolean[26];
        for(int i=0;i<s.length();i++){
            if(!freq[s.charAt(i)-'a']){
                freq[s.charAt(i)-'a']=true;
                cnt++;
            }
        }
        return cnt;
    }
}