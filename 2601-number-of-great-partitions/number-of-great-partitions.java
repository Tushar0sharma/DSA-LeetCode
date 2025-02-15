class Solution {
    int mod=(int)1e9+7;
    int [][]dp;
    public int countPartitions(int[] nums, int k) {
        int sum=0;
        int total=1;
        for(int i:nums){
            sum=(i+sum)%mod;
            total=(total*2)%mod;
        }
        if(sum<2*k) return 0;
        dp=new int[nums.length][k];
        for(int []u:dp) Arrays.fill(u,-1);
        int cnt=call(0,0,nums,k);
        return (int)(total-(2L*cnt)%mod+mod)%mod;
    }
    public int call(int i,int sum,int []nums,int k){
        if(sum>=k) return 0;
        if(i==nums.length){
            if(sum<k) return 1;
            return 0;
        }
        if(dp[i][sum]!=-1) return dp[i][sum];
        int a=call(i+1,sum+nums[i],nums,k)%mod;
        int b=call(i+1,sum,nums,k)%mod;
        return dp[i][sum]= (a+b)%mod;
    }
}