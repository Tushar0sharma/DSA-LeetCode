class Solution {
    public int[] singleNumber(int[] nums) {
        int diff=0;
        for(int num:nums){
            diff^=num;
        }   

        diff&=-diff;

        int ans[]={0,0};
        for(int num:nums){
            if((num & diff)==0){
                ans[0]^=num;
            }
            else{
                ans[1]^=num;
            }
        }
        return ans;
    }
}