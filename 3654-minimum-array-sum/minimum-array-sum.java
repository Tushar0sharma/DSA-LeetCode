class Solution {
    public int minArraySum(int[] nums, int k, int op1, int op2) {
        int [][][]dp=new int[nums.length][op1+1][op2+1];
        for(int [][]i:dp) for(int []j:i) Arrays.fill(j,-1);
        return call(0,op1,op2,k,nums,dp);
    }
    public int call(int i,int op1,int op2,int k,int []nums,int[][][]dp){
        if(i>=nums.length) return 0;
        int ans=nums[i]+call(i+1,op1,op2,k,nums,dp);
        if(dp[i][op1][op2]!=-1) return dp[i][op1][op2];
        if(op1>0){
            ans=Math.min(ans,((nums[i]+1)/2)+call(i+1,op1-1,op2,k,nums,dp));
        }
        if(op2>0 && nums[i]>=k){
            int j=nums[i]-k;
            ans=Math.min(ans,j+call(i+1,op1,op2-1,k,nums,dp));
        }
        if(op1>0 && op2>0){
            int j=(nums[i]+1)/2;
            if(j>=k){
                ans=Math.min(ans,(j-k)+call(i+1,op1-1,op2-1,k,nums,dp));
            }
        }
        if(op1>0 && op2>0 && nums[i]>=k){
            int j=nums[i]-k;
            ans=Math.min(ans,((j+1)/2)+call(i+1,op1-1,op2-1,k,nums,dp));
        }
        return dp[i][op1][op2]= ans;
    }
}