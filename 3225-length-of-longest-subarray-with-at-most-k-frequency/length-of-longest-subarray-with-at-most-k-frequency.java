class Solution {
    public int maxSubarrayLength(int[] nums, int k) {   
        Map<Integer, Integer> freq = new HashMap<>();
        int a=-1;
        int ans=0;
        for(int i=0;i<nums.length;i++){
            freq.put(nums[i],freq.getOrDefault(nums[i],0)+1);
            while(freq.get(nums[i])>k){
                a++;
                freq.put(nums[a],freq.getOrDefault(nums[a],0)-1);
            }
            ans=Math.max(ans,i-a);
        }
        return ans;
    }
}