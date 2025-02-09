class Solution {
    public int findPairs(int[] nums, int k) {
        Map<Integer,Integer>mp=new HashMap<>();
        int cnt=0;
        for(int i=0;i<nums.length;i++){
            mp.put(nums[i],mp.getOrDefault(nums[i],0)+1);
        }
        for(int i:mp.keySet()){
            if(k==0) {if(mp.get(i)>1 ) cnt++;}
            else{
                if(mp.containsKey(k+i)) cnt++;
            }
        }
        return cnt;
    }
}