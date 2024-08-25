class Solution {
    public int[] getFinalState(int[] nums, int k, int multiplier) {
        for(int j=0;j<k;j++){
            int min=Integer.MAX_VALUE;
            for(int i:nums){
                min=Math.min(i,min);
            }
            for(int i=0;i<nums.length;i++){
                if(nums[i]==min){
                    nums[i]*=multiplier;
                    break;
                }
            }
        }
        return nums;
    }
}