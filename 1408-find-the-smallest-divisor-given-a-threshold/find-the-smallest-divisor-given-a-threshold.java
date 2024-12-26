class Solution {
    public int smallestDivisor(int[] nums, int threshold) {
        int l=1;
        int r=0;
        for(int i:nums) r=Math.max(i,r);
        int ans=-1;
        while(l<=r){
            int mid=(l+r)/2;
            if(possible(nums,threshold,mid)){
                ans=mid;
                r=mid-1;
            }
            else{
                l=mid+1;
            }
        }
        return ans;
    }
    public boolean possible(int []nums,int k,int mid){
        int sum=0;
        for(int i:nums){
            sum+=Math.ceil((double)i/(double)mid);
        }
        return sum<=k;
    }
}