class Solution {
    public int findMaxLength(int[] nums) {
        for(int i=0;i<nums.length;i++){
           if(nums[i]==0) nums[i]=-1;
        }
        Map<Integer,Integer>mp=new HashMap<>();
        int sum=0,max=0;
        for(int j=0;j<nums.length;j++){
               sum+=nums[j];
                if(sum==0){
                    max=Math.max(j+1,max);
                }if(mp.containsKey(sum)){
                    max=Math.max(max,j-mp.get(sum));
                }
                else{
                    mp.put(sum,j);
                }  
        }
        return max;
    }
}