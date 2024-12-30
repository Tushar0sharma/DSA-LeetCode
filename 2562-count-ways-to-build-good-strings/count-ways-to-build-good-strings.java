class Solution {
    int l,r,numz,numo,mod=(int)1e9+7;
    int[]dp;
    public int countGoodStrings(int low, int high, int zero, int one) {
        l=low;
        dp=new int[high+1];
        Arrays.fill(dp,-1);
        numo=one;
        numz=zero;
        r=high;
        return call(0);
    }
    public int call(int len){
        if(len>r) return 0;
        if(dp[len]!=-1) return dp[len];
        if(len>=l && r>=len){
            return dp[len]= (call(len+numo)+call(len+numz)+1)%mod;
        }
        else{
            return dp[len]= (call(len+numo)+call(len+numz))%mod;
        }
    } 
}