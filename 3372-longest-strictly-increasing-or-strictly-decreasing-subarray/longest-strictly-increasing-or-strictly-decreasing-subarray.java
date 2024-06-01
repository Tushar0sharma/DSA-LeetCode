class Solution {
    public int longestMonotonicSubarray(int[] nums) {
        int in=1;
        int de=1;
        int inmax=0;
        int demax=0;
        if(nums.length==1) return 1;

        for(int i=0;i<nums.length-1;i++){
            if(nums[i]<nums[i+1]){
                in++;
            }
            else{
                in=1;
            }
            if(nums[i]>nums[i+1]){
                de++;
            }
            else{
                de=1;
            }
            inmax=Math.max(inmax,in);
            demax=Math.max(de,demax);
        }
        return Math.max(inmax,demax);
    }
}