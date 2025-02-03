class Solution {
    public int longestMonotonicSubarray(int[] nums) {
        int n=nums.length;
        if( nums.length==1) return 1;
        int []pre=new int[n];
        Arrays.fill(pre,1);
        int a=0;
        for(int i=1;i<n;i++){
            if(nums[i]>nums[i-1]) pre[i]+=pre[i-1];
            a=Math.max(a,pre[i]);
        }
        int b=0;
        int []post=new int[n];
        Arrays.fill(post,1);
        for(int i=1;i<n;i++){
            if(nums[i]<nums[i-1]) post[i]+=post[i-1];
            b=Math.max(b,post[i]);
        }
        return Math.max(a,b);
    }
}