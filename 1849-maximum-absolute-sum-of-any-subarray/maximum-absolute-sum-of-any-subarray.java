class Solution {
    public int maxAbsoluteSum(int[] nums) {
        int max=0;
        int min=Integer.MAX_VALUE;
        int sum=0;
        int n=nums.length;
        for(int i=0;i<n;i++){
            sum+=nums[i];
            max=Math.max(max,sum);
            if(sum<0) sum=0;
        }
        sum=0;
        for(int i=0;i<n;i++){
            sum+=nums[i];
            min=Math.min(min,sum);
            if(sum>0) sum=0;
        }
        return Math.max(max,Math.abs(min));
    }
}