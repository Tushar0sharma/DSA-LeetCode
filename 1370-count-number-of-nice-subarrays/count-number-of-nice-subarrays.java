class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
        int []a=new int[nums.length+1];
        int pre=0;
        int res=0;
        a[0]=1;
        for(int i:nums){
            pre+=i%2;
            if(pre>=k){
                res+=a[pre-k];
            }
            a[pre]++;
        }
        return res;
    }
}