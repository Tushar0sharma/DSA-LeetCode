class Solution {
    public int longestOnes(int[] nums, int k) {
        int n=nums.length;
        int i=0;
        int j=0,zero=0;
        int ans=0;
        while(j<n){
            if(nums[j]==0){
                zero++;
            }
            if(zero>k){
                if(nums[i]==0) zero--;
                i++;
            }
            ans=Math.max(j-i+1,ans);
            j++;
        }
        return ans;
    }
}