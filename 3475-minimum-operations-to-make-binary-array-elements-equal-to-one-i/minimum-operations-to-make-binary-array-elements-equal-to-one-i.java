class Solution {
    public int minOperations(int[] nums) {
        int ans=0;
        int n=nums.length;
        for(int i=0;i<n-2;i++){
            if(nums[i]==0){
                nums[i]=nums[i]^1;
                if(i+1<n) nums[i+1]=nums[i+1]^1;
                if(i+2<n) nums[i+2]=nums[i+2]^1;
                ans++;
            }
        }
        for(int i:nums) if(i==0) return -1;
        return ans;
    }
}