class Solution {
    public int minStartValue(int[] nums) {
        int sum=0;
        int min=0;
        for(int i:nums){
            sum+=i;
            min=Math.min(sum,min);
        }
        return 1-min;
    }
}