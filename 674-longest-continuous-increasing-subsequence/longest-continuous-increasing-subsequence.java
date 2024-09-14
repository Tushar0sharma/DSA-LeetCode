class Solution {
    public int findLengthOfLCIS(int[] nums) {
        int res=0,cnt=0;
        for(int i=0;i<nums.length;i++){
            if(i==0 || nums[i-1]<nums[i]) res=Math.max(++cnt,res);
            else cnt=1;
        }
        return res;
    }
}