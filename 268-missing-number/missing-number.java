class Solution {
    public int missingNumber(int[] nums) {
        int n=nums.length;
        boolean f=true;
        for(int i=0;i<n;i++){
            if(nums[i]==0){
                f=false;
                 nums[i]=n+1;
            }
        }
        if(f) return 0;
        for(int i=0;i<n;i++){
            int idx=Math.abs(nums[i])-1;
            if(idx<n &&nums[idx]>0) nums[idx]=-nums[idx];
        }
        for(int i=0;i<n;i++){
            if(nums[i]>0) return i+1;
        }
        return n;
    }
}