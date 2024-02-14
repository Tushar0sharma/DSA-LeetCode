class Solution {
    public int[] rearrangeArray(int[] nums) {
        int n=nums.length;
        int []pos=new int[n/2];
        int []neg=new int[n/2];
        int k=0,j=0;
        for(int i=0;i<n;i++){
            if(nums[i]>0){
                pos[k++]=nums[i];
            }
            else{
                neg[j++]=nums[i];
            }
        }
        int y=0,z=0;
        for(int b=0;b<n;b++){
            if(b%2==0){
                nums[b]=pos[y++];
            }
            else{
                nums[b]=neg[z++];
            }
        }
        return nums;
        
    }
}