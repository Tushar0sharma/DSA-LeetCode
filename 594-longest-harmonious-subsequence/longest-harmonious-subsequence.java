class Solution {
    public int findLHS(int[] nums) {
        int left=0;
        int right=1;
        Arrays.sort(nums);
        int diff=0;
        int max=0;
        while(right<nums.length){
            diff=nums[right]-nums[left];
            if(diff==1){
                max=Math.max(max,right-left+1);
            }
            if(diff>1) left++;
            else right++;
        }
        return max;
    }
}