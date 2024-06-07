class Solution {
    public int[] runningSum(int[] nums) {
        int []run=new int[nums.length];
        int sum=0,i=0;
        for(int num:nums){
            sum+=num;
            run[i++]=sum;
        }
        return run;
    }
}