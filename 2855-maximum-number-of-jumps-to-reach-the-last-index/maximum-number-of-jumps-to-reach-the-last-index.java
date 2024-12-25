class Solution {
    public int maximumJumps(int[] nums, int target) {
        int n=nums.length;
        Integer []dp=new Integer[n];
        int a=call(0,dp,nums,target);
        return a>0?a:-1;
    }
    public int call(int i,Integer []dp,int []nums,int target){
        if(i==nums.length-1) return 0;
        int ans=-1;
        if(dp[i]!=null) return dp[i];
        for(int j=i+1;j<nums.length;j++){
            int diff=nums[j]-nums[i];
            if(-target<=diff && diff<=target){
                int res=call(j,dp,nums,target);
                if(res!=-1)
                ans=Math.max(ans,res+1);
            }
        }
        return dp[i]=ans;
    }
}