class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[]arr=new int[nums.length];
        int ind=0;
        for(int i=0;i<nums.length/2;i++){
           arr[ind]=nums[i];
           ind+=2;
        }
        int indx=1;
        for(int i=n;i<nums.length;i++){
            arr[indx]=nums[i];
            indx+=2;
        }
        return arr;
    }
}