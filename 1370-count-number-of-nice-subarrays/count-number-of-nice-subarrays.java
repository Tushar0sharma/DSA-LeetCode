class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
        Map<Integer,Integer>mp=new HashMap<>();
        int pre=0;
        int res=0;
        mp.put(0,1);
        for(int i:nums){
            pre+=i%2;
            if(mp.containsKey(pre-k)){
                res+=mp.get(pre-k);
            }
            mp.put(pre,mp.getOrDefault(pre,0)+1);
        }
        return res;
    }
}