class Solution {
    public int searchInsert(int[] nums, int target) {
        int ans=nums.length;
        int r=nums.length-1;
        int l=0;
        while(l<=r){
            int mid=(l+r)/2;
            if(nums[mid]<target){
                l=mid+1;
            }
            else{
                r=mid-1;
                ans=mid;
            }
        }
        return ans;
    }
}