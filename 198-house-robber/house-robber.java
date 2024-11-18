class Solution {
    public int rob(int[] nums) {
        if(nums.length==0) return 0;
        if(nums.length==1) return nums[0];
        
        int prevn=nums[0];
        int prev=Math.max(prevn,nums[1]);        
        for(int i=2;i<nums.length;i++){
            int curr=Math.max(prev,prevn+nums[i]);
            prevn=prev;
            prev=curr;
        }
        return prev;
    }
}