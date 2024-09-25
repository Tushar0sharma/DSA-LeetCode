class Solution {
    public boolean canJump(int[] nums) {
        int n=nums.length;
        int []dp=new int[n];
        Arrays.fill(dp,-1);
        return call(dp,nums,0);
    }
    public boolean call(int []dp,int []nums,int i){
        if(i>=nums.length-1){
            return true;
        }
        if(nums[i]==0){
            dp[i]=0;
            return false;
        }
        if(dp[i]!=-1){
            return dp[i]==1;
        }
        int jump=nums[i];
        for(int k=1;k<=jump;k++){
            if(call(dp,nums,i+k)){
                dp[i]=1;
                return true;
            }
        }
        dp[i]=0;
        return false;
    }


}