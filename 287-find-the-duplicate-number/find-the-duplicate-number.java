class Solution {
    public int findDuplicate(int[] nums) {
        
        // int ans=-1;
        for(int i=0;i<nums.length;i++){
            
            int idx=Math.abs(nums[i]);
            if(nums[idx-1]<0){
                return Math.abs(nums[i]);
            }
            if(nums[idx-1]>0){
                nums[idx-1]=-nums[idx-1];
            }
        }
        for(int i:nums) System.out.print(i+" ");
        
        return -1;
    }
}