class Solution {
    public boolean check(int[] nums) {
        int rotate=0;
        for(int i=1;i<nums.length;i++){
            if(nums[i-1]>nums[i]) rotate++;
            if(rotate==2) return false;
        }
        if(nums[0]<nums[nums.length-1]) rotate++;
        return rotate<=1;
    }
}