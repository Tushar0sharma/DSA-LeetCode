class Solution {
    public int countMaxOrSubsets(int[] nums) {
        int max=0;
        for(int i=0;i<nums.length;i++){
         max|=nums[i];
        }
        int ans=subset(max,nums,0,0); 
        return ans; 
    }
    public int  subset(int max,int[]nums,int xor,int i){
        int ans=0;
        if(i==nums.length){
            return 0;
        }
        if(max==(xor|nums[i])){
            ans=1;
        }
        return ans+ subset(max,nums,xor,i+1)+ subset(max,nums,xor|nums[i],i+1);
    }
}