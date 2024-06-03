class Solution {
    public List<Integer> majorityElement(int[] nums) {
        Map<Integer,Integer>mp=new HashMap<>();

        for(int num:nums){
            mp.put(num,mp.getOrDefault(num,0)+1);
        }

        List<Integer>l=new ArrayList<>();
        int threshold=nums.length/3;

        for(Map.Entry<Integer,Integer>entry:mp.entrySet()){
            int element=entry.getKey();
            int cnt=entry.getValue();

            if(cnt>threshold){
                l.add(element);
            }
        }

        return l;
    }
}