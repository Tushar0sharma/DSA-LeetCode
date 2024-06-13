class Solution {
    public int firstMissingPositive(int[] nums) {
        boolean pre=false;
        for(int i=0;i<nums.length;i++){
        if(nums[i]<=0 || nums[i]>nums.length){
                nums[i]=1;
            }
            else if(nums[i]==1){
                pre=true;
            }
        }
        if(!pre) return 1;
        for(int i:nums){
            int idx=Math.abs(i);
            if(nums[idx-1]>0){
                nums[idx-1]=-nums[idx-1];
            }
        }
        for(int i:nums) System.out.print(i+" ");
        for(int i=0;i<nums.length;i++){
            if(nums[i]>0) return i+1;
        }
        return nums.length+1;
    }
}