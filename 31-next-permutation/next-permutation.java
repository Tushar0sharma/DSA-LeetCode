class Solution {
    public void nextPermutation(int[] nums) {
        int  i=nums.length-2;
        while(i>=0 && nums[i+1]<=nums[i]) i--;
        if(i>=0){
            int j=nums.length-1;
            while(j>=0 && nums[i]>=nums[j]) j--;
            swap(i,j,nums);
        }
        rev(nums,i+1);
    }
    public void rev(int []nums,int i){
        int j=nums.length-1;
        while(i<j){
            swap(i++,j--,nums);
        }
    }
    public void swap(int i,int j,int[]nums){
        int r=nums[j];
        nums[j]=nums[i];
        nums[i]=r;
    }
}