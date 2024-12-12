class Solution {
    public int leastInterval(char[] tasks, int n) {
        int []freq=new int[26];
        int max=0;
        for(char ch:tasks){
            freq[ch-'A']++;
            max=Math.max(freq[ch-'A'],max);
        }
        int slot=(max-1)*(n+1);
        for(int i:freq) if(i==max) slot++;
        return slot<tasks.length ? tasks.length:slot;
    }
}