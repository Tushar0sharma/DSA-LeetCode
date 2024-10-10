class Solution {
    public int maxWidthRamp(int[] nums) {
        int n=nums.length;
        int []min=new int[n],max=new int[n];
        min[0]=nums[0];
        max[n-1]=nums[n-1];
        for(int i=1;i<n;i++) min[i]=Math.min(min[i-1],nums[i]);
        for(int i=n-2;i>=0;i--) max[i]=Math.max(max[i+1],nums[i]);
        int i=0;
        int j=0;
        int ans=0;
        while(j<n){
            if(max[j]>=min[i]){
                ans=Math.max(ans,j-i);
                j++;
            }
            else i++;
        }
        return ans;
    }
}