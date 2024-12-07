class Solution {
    public int minimumSize(int[] nums, int maxOperations) {
        int l=1;
        int r=1;
        for(int i:nums) r=Math.max(i,r);
        int ans=r;
        while(l<=r){
            int mid=(l+r)/2;
            if(call(nums,maxOperations,mid)){
                ans=mid;
                r=mid-1;
            }
            else{
                l=mid+1;
            }
        }
        return ans;
    }
    public boolean  call(int []nums,int max,int mid){
        int cnt=0;
        for(int i:nums){
            int a=i/mid;
            if(i%mid==0) a--;
            cnt+=a; 
        }
        return max>=cnt;
    }
}