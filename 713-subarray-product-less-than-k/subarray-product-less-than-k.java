class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        int res=0,left=0,prod=1;
        for(int right=0;right<nums.length;right++){
            prod*=nums[right];
            while(left<=right && prod>=k){
                prod/=nums[left];
                left++;
            }
            res+=right-left+1;
        }
        return res;
    }
}