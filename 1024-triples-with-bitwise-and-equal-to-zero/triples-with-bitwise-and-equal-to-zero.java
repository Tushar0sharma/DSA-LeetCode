class Solution {
    public int countTriplets(int[] nums) {
        int ans=0;
        Map<Integer,Integer>mp=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            for(int j=0;j<nums.length;j++){
                int num=nums[i]&nums[j];
                mp.put(num,mp.getOrDefault(num,0)+1);
            }
        }
        for(int i=0;i<nums.length;i++){
            for(int num:mp.keySet()){
                if((nums[i]&num)==0){
                    ans+=mp.get(num);
                }
            }
        }
        return ans;
    }
}