class Solution {
    public int[] frequencySort(int[] nums) {
        Map<Integer,Integer>mp=new HashMap<>();
        for(int i:nums) mp.put(i,mp.getOrDefault(i,0)+1);
        Integer[]obj=new Integer[nums.length];
        for(int i=0;i<nums.length;i++) obj[i]=nums[i];
        Arrays.sort(obj,(a,b)->{
            if(mp.get(a).equals(mp.get(b))) return Integer.compare(b,a);
            return Integer.compare(mp.get(a),mp.get(b));
        });
        for(int i=0;i<nums.length;i++) nums[i]=obj[i];
        return nums;
    }
}