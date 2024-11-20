class Solution {
    Map<Integer,List<Integer>>mp;
    public Solution(int[] nums) {
        mp=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            List<Integer>l=mp.getOrDefault(nums[i],new ArrayList<>());
            l.add(i);
            mp.put(nums[i],l);
        }
    }
    
    public int pick(int target) {
        return mp.get(target).get((int)(Math.random()*mp.get(target).size()));
    }
}

/**
 * Your Solution object will be instantiated and called as such:
 * Solution obj = new Solution(nums);
 * int param_1 = obj.pick(target);
 */