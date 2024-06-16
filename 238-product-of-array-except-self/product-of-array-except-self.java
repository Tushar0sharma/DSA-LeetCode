class Solution {
    public int[] productExceptSelf(int[] nums) {
        int prod=1;
        int []ans=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            ans[i]=nums[i]*prod;
            prod=prod*nums[i];
        }
        prod=1;
        for(int i=nums.length-1;i>=1;i--){
            ans[i]=ans[i-1]*prod;
            prod*=nums[i];
        }
        ans[0]=prod;
        return ans;
    }
}