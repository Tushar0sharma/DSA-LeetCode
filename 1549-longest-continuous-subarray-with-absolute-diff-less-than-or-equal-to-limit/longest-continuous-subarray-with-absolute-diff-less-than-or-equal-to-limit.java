class Solution {
    public int longestSubarray(int[] nums, int limit) {
        int i,j=0,ans=0;
        TreeMap<Integer,Integer>m=new TreeMap<>();
        for(i=0;i<nums.length;i++){
            m.put(nums[i],m.getOrDefault(nums[i],0)+1);
            while(m.lastEntry().getKey()-m.firstEntry().getKey()>limit){
                m.put(nums[j],m.get(nums[j])-1);
                if(m.get(nums[j])==0){
                    m.remove(nums[j]);
                }
                j++;
            }
            ans=Math.max(i-j+1,ans);
        }
        return ans;
    }
}