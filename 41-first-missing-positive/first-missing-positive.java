class Solution {
    public int firstMissingPositive(int[] nums) {
        HashSet<Integer>l=new HashSet<>();
        for(int i=0;i<nums.length;i++){
            l.add(nums[i]);
        }

        for(int i=1;i<=nums.length;i++){
            if(l.contains(i)){
                continue;
            }
            else{
                return i;
            }
        }
        return nums.length+1;
    }
}