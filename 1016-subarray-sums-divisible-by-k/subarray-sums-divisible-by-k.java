class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        Map<Integer,Integer>mp=new HashMap<>();
        int sum=0;
        int cnt=0;
        mp.put(0,1);
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
            int r=sum%k;
            if(r<0) r+=k;
            cnt+=mp.getOrDefault(r,0);
            mp.put(r,mp.getOrDefault(r,0)+1);
        }
        return cnt;
    }
}