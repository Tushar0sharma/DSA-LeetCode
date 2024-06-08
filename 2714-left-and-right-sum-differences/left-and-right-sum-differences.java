class Solution {
    public int[] leftRightDifference(int[] nums) {
        int n=nums.length;
        int []left=new int[n];
        int []right=new int[n];
        left[0]=0;
        right[n-1]=0;
        int sum=nums[0];
        for(int i=1;i<n;i++){
            left[i]=sum;
            sum+=nums[i];
        }
        sum=nums[n-1];
        for(int i=n-2;i>=0;i--){
            right[i]=sum;
            sum+=nums[i];
        }
        int []ans=new int[n];
        for(int i=0;i<n;i++){
            ans[i]=Math.abs(left[i]-right[i]);
        }
        return ans;
    }
}