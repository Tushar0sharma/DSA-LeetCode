class Solution {
    public int findDuplicate(int[] nums) {
        for(int i=0;i<nums.length;i++){
            int idx=Math.abs(nums[i]);
            if(nums[idx-1]<0){
                return idx;
            }
            if(nums[idx-1]>0){
                nums[idx-1]*=-1;
            }
        }
        return -1;
    }
}