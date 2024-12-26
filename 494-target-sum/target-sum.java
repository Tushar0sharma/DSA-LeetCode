class Solution {
    public int findTargetSumWays(int[] nums, int target) {
        return call(0,target,0,nums);
    }
    public int call(int i,int t,int sum,int []nums){
        if(i==nums.length){
            if(t==sum) return 1;
            else return 0;
        } 
        int ans=0;
        ans+=call(i+1,t,sum-nums[i],nums);
        ans+=call(i+1,t,sum+nums[i],nums);
        return ans;
    }
}