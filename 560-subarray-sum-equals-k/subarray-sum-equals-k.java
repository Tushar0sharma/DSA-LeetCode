class Solution {
    public int subarraySum(int[] nums, int k) {
        Map<Integer,Integer>mp=new HashMap<>();
        int pres=0;
        mp.put(0,1);
        int res=0;
        for(int i:nums){
            pres+=i;
            if(mp.containsKey(pres-k)){
                res+=mp.get(pres-k);
            }
            mp.put(pres,mp.getOrDefault(pres,0)+1);
        }
        return res;
    }
}