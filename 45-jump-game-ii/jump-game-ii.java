class Solution {
    public int jump(int[] nums) {
        int jump=0,max=nums[0],end=0;
        for(int i=0;i<nums.length-1;i++){
            max=Math.max(max,nums[i]+i);
            if(i==end){
                jump++;
                end=max;
            }
        }
        return jump;
    }
}