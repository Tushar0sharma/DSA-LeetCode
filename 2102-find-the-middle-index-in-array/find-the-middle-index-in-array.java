class Solution {
    public int findMiddleIndex(int[] nums) {
        int n=nums.length;
        int []left=new int[n];
        int []right=new int[n];
        int sum=0;
        for(int i=0;i<nums.length;i++){
            left[i]=sum;
            sum+=nums[i];
        }
        sum=0;
        for(int i=n-1;i>=0;i--){
            right[i]=sum;
            sum+=nums[i];
        }
        for(int i=0;i<n;i++){
            if(left[i]==right[i]) return i;
        }
        return -1;
    }
}