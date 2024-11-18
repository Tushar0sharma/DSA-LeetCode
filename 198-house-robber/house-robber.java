class Solution {
    public int rob(int[] nums) {
        int []dp=new int [nums.length];
        for(int i=0;i<nums.length;i++){
            int k=0;
            if(i-2>=0) k=dp[i-2];
            int take=k+nums[i];
            int k1=0;
            if(i-1>=0) k=dp[i-1];
            int nt=k;
            dp[i]=Math.max(take,nt);
        }
        return dp[nums.length-1];
    }
}