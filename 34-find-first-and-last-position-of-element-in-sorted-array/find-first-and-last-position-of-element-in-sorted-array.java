class Solution {
    public int[] searchRange(int[] nums, int target) {
        int []ans={-1,-1};
        ans[0]=lowerbound(nums,target);
        ans[1]=upperbound(nums,target);
        return ans;
    }
    public int upperbound(int []nums,int t){
        int l=0;
        int r=nums.length-1;
        int ans=-1;
        while(l<=r){
            int mid=(l+r)/2;
            if(nums[mid]==t) {
                ans=mid;
                l=mid+1;
            }
            else if(nums[mid]<t) l=mid+1;
            else r=mid-1;
        }
        return ans;
    }
    public int lowerbound(int []nums,int t){
        int l=0;
        int r=nums.length-1;
        int ans=-1;
        while(l<=r){
            int mid=(l+r)/2;
            if(nums[mid]==t) {
                ans=mid;
                r=mid-1;
            }
            else if(nums[mid]<t) l=mid+1;
            else r=mid-1;
        }
        return ans;
    }
}