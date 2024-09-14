class Solution {
    public int longestSubarray(int[] nums) {
        int max=nums[0];
        int l=1;
        int ans=1;
        for(int i=1;i<nums.length;i++){
            if(nums[i]==max){
                l++;
                ans=Math.max(ans,l);
            }
            else if(nums[i]>max){
                l=1;
                ans=1;
                max=nums[i];
            }
            else l=0;
        }
        return ans;
    }
}