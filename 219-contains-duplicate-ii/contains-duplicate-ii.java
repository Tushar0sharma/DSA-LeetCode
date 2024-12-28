class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        int i=0,j=0;
        Set<Integer>s=new HashSet<>();
        while(j<nums.length){
            if(j-i>k){
                s.remove(nums[i++]);
            }
            if(!s.add(nums[j])) return true;
            j++;
        }
        return false;
    }
}