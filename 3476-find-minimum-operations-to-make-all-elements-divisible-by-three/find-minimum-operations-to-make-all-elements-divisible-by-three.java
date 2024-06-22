class Solution {
    public int minimumOperations(int[] nums) {
        int cnt=0;
        for(int i:nums){
            int a=i%3;
            if(a==2||a==1) cnt++;
        }
        return cnt;
    }
}