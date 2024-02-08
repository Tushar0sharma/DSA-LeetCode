class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        int n=nums.length;
    //     HashMap<Integer,Integer>ans=new HashMap<Integer,Integer>();
    //    for(int i=0;i<n;i++){
    //        if(ans.containsKey(nums[i])){
    //            if(i-ans.get(nums[i]) <=k) return true;
    //        }
    //        ans.put(nums[i],i);
    //    }
    //    return false;
     if(nums == null || nums.length < 2 || k == 0)
            return false;
    int j=0;
      HashSet<Integer>ans=new HashSet<Integer>();
      for(int i=0;i<n;i++){
          if(!ans.add(nums[i])){
             return true;
          }
          if(ans.size()>=k+1){
              ans.remove(nums[j++]);
          }
      }
      return false;
        
    }
}