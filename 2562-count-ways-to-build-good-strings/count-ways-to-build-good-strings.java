class Solution {
    int numz,numo,mod;
    int[]dp;
    public int countGoodStrings(int low, int high, int zero, int one) {
        int ans=0;
        numz=zero;
        dp=new int[high+1];
        Arrays.fill(dp,-1);
        numo=one;
         mod=(int)1e9+7;
        for(int i=low;i<=high;i++){
            ans=(ans+call(i))%mod;
        }
        return ans;
    }
    public int call(int target){
        if(target==0) return 1;
        if(target<0) return 0;
        if(dp[target]!=-1) return dp[target];
        int a=call(target-numz);
        int b=call(target-numo);
        return dp[target]=(a+b)%mod;
    }
}