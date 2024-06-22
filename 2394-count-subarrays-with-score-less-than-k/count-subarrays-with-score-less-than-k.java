class Solution {
    public long countSubarrays(int[] nums, long k) {
        int left=0;
        long res=0;
        long sum=0;
        for(int right=0;right<nums.length;right++){
            sum+=nums[right];
            while((sum*(right-left+1))>=k){
                sum-=nums[left++];
            }
            res=res+right-left+1;
        }
        return res;
    }
}