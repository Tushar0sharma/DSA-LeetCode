class Solution {
    public int minIncrementForUnique(int[] nums) {
        Arrays.sort(nums);
        int cnt=0;
        for(int i=1;i<nums.length;i++){
            while(nums[i-1]>=nums[i]){
                nums[i]++;
                cnt++;
            }
        }
        return cnt;
    }
}