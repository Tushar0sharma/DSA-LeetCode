class Solution {
    public int minDifference(int[] nums) {
        if(nums.length<5) return 0;
        int min=Integer.MAX_VALUE;
        Arrays.sort(nums);
        int i=0;
        int j=nums.length-4;
        while(j<nums.length){
            min=Math.min(min,nums[j]-nums[i]);
            i++;
            j++;
        }
        return min;
    }
}