class Solution {
    public int waysToSplitArray(int[] nums) {
        int n=nums.length;
        long []pre=new long[n];
        pre[0]=nums[0];
        for(int i=1;i<n;i++) pre[i]=pre[i-1]+nums[i];
        long []post=new long[n];
        post[n-1]=nums[n-1];
        for(int i=n-2;i>=0;i--) post[i]=post[i+1]+nums[i];
        int ans=0;

        for(int i=0;i<n;i++){
            if(i+1<n &&pre[i]>=post[i+1]) ans++;
        }
        return ans;
    }
}