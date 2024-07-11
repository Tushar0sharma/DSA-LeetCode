class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Map<Integer,Integer>mp=new HashMap<>();
        for(int i:nums1) {
            if(!mp.containsKey(i))
            mp.put(i,mp.getOrDefault(i,0)+1);
        }
        List<Integer>l=new ArrayList<>();
        for(int i:nums2) {
            if(mp.containsKey(i) && !l.contains(i)){
                l.add(i);
            }
        }
        return l.stream().mapToInt(Integer::intValue).toArray();
    }
}