class Solution {
    public boolean check(int[] nums) {
        int rotate=0;
        if(nums.length==1) return true;
        for(int i=1;i<nums.length;i++){
            if(nums[i-1]>nums[i]) rotate++;
            if(rotate>1) return false;
        }
        if(nums[nums.length-1]>nums[0]) rotate++;
        return rotate<=1;
    }
}