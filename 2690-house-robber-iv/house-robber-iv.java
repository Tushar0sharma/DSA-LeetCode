class Solution {
    public int minCapability(int[] nums, int k) {
        int l=Integer.MAX_VALUE,r=0;
        for(int i:nums){
            l=Math.min(l,i);
            r=Math.max(r,i);
        }
        while(l<=r){
            int mid=(l+r)/2;
            if(call(mid,k,nums)){
                r=mid-1;
            }
            else{
                l=mid+1;
            }
        }
        return l;
    }
    public boolean call(int mid,int k,int []nums){
        int i=0;
        while(i<nums.length){
            if(nums[i]<=mid) {
                k--;i+=2;
            }
            else i++;
            if(k==0) return true;
        }
        return false;
    }
}