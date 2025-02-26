class Solution {
    public int maxAbsoluteSum(int[] nums) {
        //my previous approach was good but you can't qaccess it hmmm...
        
        int max=0;
        int min=0;
        int sum=0;
        int n=nums.length;
        for(int i=0;i<n;i++){
            sum+=nums[i];
            max=Math.max(max,sum);
            min=Math.min(min,sum);
        }
        return max-min;
    }
}