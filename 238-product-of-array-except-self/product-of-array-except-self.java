class Solution {
    public int[] productExceptSelf(int[] nums) {
        int prodl=1;
        int prodr=1;
        int []left=new int[nums.length];
        int []right=new int[nums.length];
        left[0]=1;
        right[nums.length-1]=1;
        for(int i=1;i<nums.length;i++){
            prodl*=nums[i-1];
            left[i]=prodl;
        }
        for(int i=nums.length-2;i>=0;i--){
            prodr*=nums[i+1];
            right[i]=prodr;
        }
        int res[]=new int [nums.length];
        for(int i=0;i<nums.length;i++){
            res[i]=left[i]*right[i];
        }
        return res;
    }
}