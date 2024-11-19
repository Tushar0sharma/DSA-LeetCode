class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
        long sum=0;
        int j=0;
        long max=0;
        Map<Integer,Integer>mp=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            mp.put(nums[i],mp.getOrDefault(nums[i],0)+1);
            sum+=nums[i];
            while(mp.get(nums[i])>1){
                mp.put(nums[j],mp.getOrDefault(nums[j],0)-1);
                if(mp.get(nums[j])==0) mp.remove(nums[j]);
                sum-=nums[j];
                j++;
            }
            if(i-j+1>k){
                sum-=nums[j];
                mp.put(nums[j], mp.get(nums[j]) - 1);
                if (mp.get(nums[j]) == 0) mp.remove(nums[j]);
                j++;
            }
            if(i-j+1==k){
                max=Math.max(max,sum);
            }
        }
        return max;
    }
}