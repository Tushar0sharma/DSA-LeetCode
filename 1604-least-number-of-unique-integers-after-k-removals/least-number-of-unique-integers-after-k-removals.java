class Solution {
    public int findLeastNumOfUniqueInts(int[] arr, int k) {
        Map<Integer,Integer>mp=new HashMap<>();
        for(int i:arr){
            mp.put(i,mp.getOrDefault(i,0)+1);
        }
        int[]nums=new int[mp.size()];
        int b=0;
        for(int i:mp.values()){
            nums[b++]=i;
        }
        Arrays.sort(nums);
        int i=0;
        for( i=0;i<mp.size();i++){
            if(nums[i]<=k){
                k=k-nums[i];
            }
            else {
                return nums.length-i;
            }
        }
        return nums.length-i;
    }
}