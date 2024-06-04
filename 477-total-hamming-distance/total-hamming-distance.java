class Solution {
    public int totalHammingDistance(int[] nums) {
        int sum=0;
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                sum+=humming(nums[i],nums[j]);
            }
        }
        return sum;
    }
    public int humming(int x,int y){
        return Integer.bitCount(x^y);
    }
}