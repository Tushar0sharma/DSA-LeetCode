class Solution {
    public double minimumAverage(int[] nums) {
        Arrays.sort(nums);
        int i=0,j=nums.length-1;
        double ans=51;
        while(i<j){
            double d=(nums[i++]+nums[j--])/2.0;
            ans=Math.min(ans,d);
        }
        return ans;
    }
}