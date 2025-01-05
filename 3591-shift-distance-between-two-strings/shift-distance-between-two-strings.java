class Solution {
    public long shiftDistance(String s, String t, int[] nextCost, int[] previousCost) {
        long ans=0;
        for(int i=0;i<s.length();i++){
            int ss=s.charAt(i)-'a';
            int tt=t.charAt(i)-'a';
            if(ss==tt) continue;
            long prev=0,next=0;
            for(int j=ss;j!=tt;j=(j+1)%26) next+=nextCost[j];
            for(int j=ss;j!=tt;j=(j-1+26)%26) prev+=previousCost[j];
            ans+=Math.min(prev,next);
        }
        return ans;
    }
}