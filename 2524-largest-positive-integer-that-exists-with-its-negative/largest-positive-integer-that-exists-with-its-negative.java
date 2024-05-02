class Solution {
    public int findMaxK(int[] nums) {
        int[] idx=new int[1003];
        int[] neg=new int[1003];
        for(int i=0;i<nums.length;i++){
            int k=Math.abs(nums[i]);
            if(nums[i]<0){
                neg[k]++;
            }
            else{
                idx[k]++;
            }
        }
        for(int i=idx.length-1;i>=0;i--){
            if(idx[i]>0 && neg[i]>0) return i;
        }
        return -1;
    }
}