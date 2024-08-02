class Solution {
    public int minSwaps(int[] arr) {
        int size=0;
        for(int i:arr) size+=i;
        int[] nums=new int[arr.length+size];
        for(int i=0;i<arr.length;i++){
            nums[i]=arr[i];
            if(i<size)
            nums[i+arr.length]=arr[i];
        }
        int n=nums.length;
        
        if(size==0) return 0;
        int st=0;
        int min=0;
        int k=Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            min+=nums[i];
            if (i >= size) {
                min -= nums[i - size];
            }

            if (i >= size - 1) {
                k = Math.min(k, size - min);
            }
        }
        return k;        
    }
}