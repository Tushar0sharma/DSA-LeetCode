class Solution {
    public int maximumBeauty(int[] nums, int k) {
        Arrays.sort(nums);
        int j=0;
        int max=0;
        for(int i=0;i<nums.length;i++){
            while(i>j &&nums[i]-nums[j]>2*k){
                j++;
            }
            max=Math.max(i-j+1,max);
        }
        return max;
    }
}