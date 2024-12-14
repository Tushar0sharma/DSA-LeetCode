class Solution {
    public long continuousSubarrays(int[] nums) {
        long ans=0;
        TreeMap<Integer,Integer>mp=new TreeMap<>();
        int l=0;
        for(int r=0;r<nums.length;r++){
            mp.put(nums[r],mp.getOrDefault(nums[r],0)+1);
            while(mp.lastEntry().getKey()-mp.firstEntry().getKey()>2){
                mp.put(nums[l],mp.get(nums[l])-1);
                if(mp.get(nums[l])==0){
                    mp.remove(nums[l]);
                }
                l++;
            }
            ans+=r-l+1;
        }
        return ans;
    }
}