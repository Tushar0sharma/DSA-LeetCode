class Solution {
    public int triangleNumber(int[] nums) {
        Arrays.sort(nums);
        int n=nums.length;
        int ans=0;
        for(int k=n-1;k>=0;k--){
            int i=0;
            int j=k-1;
            while(i<j){
                if(nums[i]+nums[j]>nums[k]){
                    ans+=j-i;
                    j--;
                }else i++;
            }
        }
        return ans;
    }
}