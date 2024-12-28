class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int n=nums.length;
        int []ans=new int[n-k+1];
        int []lmax=new int[n];
        int []rmax=new int[n];
        lmax[0]=nums[0];
        rmax[n-1]=nums[n-1];
        for(int i=1;i<n;i++){
            lmax[i]=(i%k==0)?nums[i]:Math.max(lmax[i-1],nums[i]);
        }
        for(int i=n-2;i>=0;i--){
            rmax[i]=(i%k==0)?nums[i]:Math.max(rmax[i+1],nums[i]);
        }
        for(int i=0,j=i+k-1;j<n;i++,j++){
            ans[i]=Math.max(lmax[j],rmax[i]);
        }
        return ans;
    }
}