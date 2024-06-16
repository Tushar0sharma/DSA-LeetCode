class Solution {
    public int destroyTargets(int[] nums, int space) {
        Map<Integer,Integer>mp=new HashMap<>();
        for(int i:nums){
            int num=i%space;
            mp.put(num,mp.getOrDefault(num,0)+1);
        }
        int max=Collections.max(mp.values());
        int min=Integer.MAX_VALUE;
        for(int i:nums){
            int num=i%space;
            if(mp.get(num)==max){
                min=Math.min(i,min);
            }
        }
        return min;
    }
}