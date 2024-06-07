class Solution {
    public int majorityElement(int[] nums) {
        Map<Integer,Integer>mp=new HashMap<>();
        for(int num:nums){
            mp.put(num,mp.getOrDefault(num,0)+1);
        }
        for(int num:mp.keySet()){
            if(mp.get(num)>(nums.length/2)){
              return num;  
            }
        }
        return -1;
    }
}