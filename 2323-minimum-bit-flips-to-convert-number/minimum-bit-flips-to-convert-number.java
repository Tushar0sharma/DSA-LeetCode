class Solution {
    public int minBitFlips(int start, int goal) {
        int t=start^goal;
        int cnt=0;
        while(t!=0){
            if((t&1)==1) cnt++;
            t=t>>1;
        }
        return cnt;
    }
}