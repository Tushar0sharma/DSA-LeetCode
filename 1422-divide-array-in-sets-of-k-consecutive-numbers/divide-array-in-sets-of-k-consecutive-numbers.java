class Solution {
    public boolean isPossibleDivide(int[] nums, int k) {
        if(nums.length%k!=0) return false;
        Map<Integer,Integer>mp=new HashMap<>();
        for(int num:nums){
            mp.put(num,mp.getOrDefault(num,0)+1);
        }
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i++){
            if(mp.get(nums[i])==0) continue;
            for(int j=0;j<k;j++){
                int curr=nums[i]+j;
                if(mp.getOrDefault(curr,0)==0) return false;
                mp.put(curr,mp.get(curr)-1);
            }
        }
        return true;
    }
}