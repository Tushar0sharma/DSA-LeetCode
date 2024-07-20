class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        Map<Integer,Integer>mp=new HashMap<>();
        mp.put(0,1);
        int ans=0;
        int sum=0;
        for(int n:nums){
            sum+=n;
            int rem=sum%k;
            if(rem<0) rem+=k;
            ans+=mp.getOrDefault(rem,0);
            mp.put(rem,mp.getOrDefault(rem,0)+1);
        }
        return ans;
    }
}