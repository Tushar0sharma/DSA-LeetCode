class Solution {
    public int lengthOfLIS(int[] nums) {
        int n=nums.length;
        int []dp=new int[n+1];

        for(int i=n-1;i>=0;i--){
            int []curr=new int[n+1];
            for(int j=n-1;j>=-1;j--){
                int nt=dp[j+1];
                int t=0;
                if(j==-1 || nums[j]<nums[i]){
                    t=1+dp[i+1];
                }
                curr[j+1]=Math.max(t,nt);
            }
            dp=curr;
        }
        return dp[0];
    }
}