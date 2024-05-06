class Solution {
    public int removeDuplicates(int[] nums) {
        int t=0;
        for(int i=0;i<nums.length;i++){
            if(t<2 || nums[i]>nums[t-2]){
                nums[t++]=nums[i];
            }
        }
        return t;
    }
}