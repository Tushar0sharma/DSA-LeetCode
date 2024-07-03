class Solution {
    public boolean checkPossibility(int[] nums) {
        int prev=nums[0];
        int cnt=0;
        for(int i=1;i<nums.length;i++){
            if(nums[i]<prev){
                if(cnt++==1) return false;
                if(i>1 && nums[i]<nums[i-2]) continue;
            }
            prev=nums[i];
        }
        return true;
    }
}