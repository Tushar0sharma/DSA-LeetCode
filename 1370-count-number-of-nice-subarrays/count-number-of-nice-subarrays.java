class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
        for(int end=0;end<nums.length;end++){
            if(nums[end]%2!=0){
                nums[end]=1;
            }
            else{
                nums[end]=0;
            }
        }
        int []a=new int[nums.length+1];
        int pre=0;
        int res=0;
        a[0]=1;
        for(int i:nums){
            pre+=i;
            if(pre>=k){
                res+=a[pre-k];
            }
            a[pre]++;
        }
        return res;
    }
}