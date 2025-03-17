class Solution {
    public boolean divideArray(int[] nums) {
        int xor=0;
        int[]arr=new int[501];
        for(int i=0;i<nums.length;i++){ 
            if(arr[nums[i]]==0) arr[nums[i]]++;
            else arr[nums[i]]--;
        }   
        // System.out.println(Arrays.toString(arr));
        for(int i:arr) if(i!=0) return false;
        return xor==0;
    }
}