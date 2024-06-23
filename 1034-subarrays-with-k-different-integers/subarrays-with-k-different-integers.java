class Solution {
    public int subarraysWithKDistinct(int[] nums, int k) {
        return atmost(nums,k)-atmost(nums,k-1);        
    }
    public int atmost(int []nums,int k){
        int j=0,ans=0;
        Map<Integer,Integer>mp=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            mp.put(nums[i],mp.getOrDefault(nums[i],0)+1);
            while(j<=i && mp.size()>k){
                mp.put(nums[j],mp.getOrDefault(nums[j],0)-1);
                mp.remove(nums[j++],0);
            }
            ans+=i-j+1;
        }
        return ans;
    }
}