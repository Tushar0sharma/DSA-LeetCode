class Solution {
    public int[] getMaximumXor(int[] nums, int maximumBit) {
        int n=nums.length;
        int []ans=new int[n];
        int []pre=new int[n];
        int c=0,u=0;
        for(int i:nums){
            c=c^i;
            pre[u++]=c;
        }
        int max=(1<<maximumBit)-1;
        int i=0;
        for(int j=n-1;j>=0;j--){
            ans[i++]=pre[j]^max;
        }
        return ans;
    }
}