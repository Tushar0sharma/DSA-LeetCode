class Solution {
    public long largestPerimeter(int[] nums) {
        Arrays.sort(nums);
        long []prefixsum=new long[nums.length];
        long sum=0;
        for(int i=0;i<nums.length;i++){
          prefixsum[i]=sum;
          sum+=nums[i];
        }
        for(int i=nums.length-1;i>=2;i--){
            if(prefixsum[i]>nums[i]){
                return (prefixsum[i] + (long)nums[i]);
            }
        }
        return -1;
    }
}