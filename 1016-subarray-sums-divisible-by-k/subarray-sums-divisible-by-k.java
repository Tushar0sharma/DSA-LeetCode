class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        Map<Integer,Integer>mp=new HashMap<>();
        mp.put(0,1);
        int curr=0,ans=0;
        for(int num:nums){
            curr+=num;
            int rem=curr%k;
            if(rem<0){
                rem+=k;
            }
            ans+=mp.getOrDefault(rem,0);
            mp.put(rem,mp.getOrDefault(rem,0)+1);
        }
        return ans;
    }
}