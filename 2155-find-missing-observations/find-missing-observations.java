class Solution {
    public int[] missingRolls(int[] rolls, int mean, int n) {
        int sum=0;
        for(int i:rolls) sum+=i;
        int remain=mean*(rolls.length+n)-sum;
        if(remain > 6*n || remain<n) return new int[0];
        int m=remain/n;
        int mod=remain%n;
        int []ans=new int[n];
        Arrays.fill(ans,m);
        for(int i=0;i<mod;i++){
            ans[i]++;
        }
        return ans;
    }
}