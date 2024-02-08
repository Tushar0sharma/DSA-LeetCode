class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        int n=nums.length;
        HashMap<Integer,Integer>ans=new HashMap<Integer,Integer>();
       for(int i=0;i<n;i++){
           if(ans.containsKey(nums[i])){
               if(i-ans.get(nums[i]) <=k) return true;
           }
           ans.put(nums[i],i);
       }
       return false;
        
    }
}