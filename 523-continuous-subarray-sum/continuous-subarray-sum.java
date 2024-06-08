class Solution {
    public boolean checkSubarraySum(int[] nums, int k) {
        Map<Integer,Integer>mp=new HashMap<>();
        mp.put(0,-1);
        int sum=0;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
            if(k!=0) sum=sum%k;
            Integer prev=mp.get(sum);
            if(prev!=null){
                if(i-prev>1) return true;
            }
            else{
                mp.put(sum,i);
            }
        }
        return false;
    }
}