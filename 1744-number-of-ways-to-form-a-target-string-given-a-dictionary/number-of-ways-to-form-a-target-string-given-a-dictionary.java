class Solution {
    int n;
    int k;
    int mod=(int)1e9+7;
    int [][]dp;
    public int numWays(String[] words, String target) {
         n=words[0].length();
         k=target.length();
        int [][]freq=new int[n][26];
        dp=new int[n+1][k+1];
        for(int []i:dp) Arrays.fill(i,-1);

        for(int i=0;i<n;i++){
            for(int j=0;j<words.length;j++){
                freq[i][words[j].charAt(i)-'a']++;
            }
        }
        return call(0,0,freq,target);
    }
    public int call(int i,int j,int[][]freq,String s){
        if(j==k){
            return 1;
        }
        if(i==n) return 0;
        if(dp[i][j]!=-1) return dp[i][j];
        int nottake=(call(i+1,j,freq,s))%mod;
        int take = 0;
        if (freq[i][s.charAt(j) - 'a'] > 0) {
            take = (int) ((long) freq[i][s.charAt(j) - 'a'] * call(i + 1, j + 1, freq, s) % mod);
        }
        return dp[i][j]=(take+nottake)%mod;
    }
}