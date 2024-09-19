class Solution {
    public int minDifficulty(int[] jobDifficulty, int d) {
        int n=jobDifficulty.length;
        if(n<d) return -1;
        int [][]dp=new int[n][d+1];
        for(int []i:dp) Arrays.fill(i,-1);
        return call(0,d,jobDifficulty,dp);
    }
    public int call(int idx,int d,int[]nums,int [][]dp){
        if(d==1){
            int max=nums[idx];
            for(int i=idx;i<nums.length;i++) max=Math.max(max,nums[i]);
            return max;
        }
        if(dp[idx][d]!=-1) return dp[idx][d];
        int f=Integer.MAX_VALUE;
        int max=0;
        for(int i=idx;i<=nums.length-d;i++){
             max=Math.max(max,nums[i]);
            int res=max+call(i+1,d-1,nums,dp);
            f=Math.min(f,res);
        }
        return dp[idx][d]=f;
    }
}