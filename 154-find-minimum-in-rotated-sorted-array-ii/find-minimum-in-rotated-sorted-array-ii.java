class Solution {
    public int findMin(int[] nums) {
        int ans=Integer.MAX_VALUE;
        int i=0;
        int j=nums.length-1;
        while(i<=j){
            int mid=(i+j)/2;
            ans=Math.min(ans,nums[mid]);
            if(nums[mid]==nums[i] && nums[mid]==nums[j]){
                i++;
                j--;
                continue;
            }
            if(nums[i]<=nums[mid]){
                ans=Math.min(ans,nums[i]);
                i=mid+1;
            }
            else{
                ans=Math.min(ans,nums[mid]);
                j=mid-1;
            }
        }
        return ans;
    }
}