class Solution {
    public int maximumBeauty(int[] nums, int k) {
        Map<Integer,Integer>mp=new TreeMap<>();
        for(int i:nums){
            mp.put(i-k,mp.getOrDefault(i-k,0)+1);
            mp.put(i+k+1,mp.getOrDefault(i+k+1,0)-1);
        }
        int cnt=0;
        int max=0;
        for(int i:mp.keySet()){
            cnt+=mp.get(i);
            if(cnt>max) max=cnt;
        }
        return max;
    }
}