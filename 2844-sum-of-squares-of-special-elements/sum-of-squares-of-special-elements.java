class Solution {
    public int sumOfSquares(int[] nums) {
        int ans=0;
        int len=nums.length;
        for(int i=1;i<=len;i++){
            if(len%i==0){
                ans+=nums[i-1]*nums[i-1];
            }
        }
        return ans;
    }
}