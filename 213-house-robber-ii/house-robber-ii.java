class Solution {
    public int rob(int[] nums) {
        int n=nums.length;
        if(n==1) return nums[0];
        int nums1[]=new int[nums.length-1];
        int []nums2=new int[nums.length-1];
        for(int i=0;i<n-1;i++){
            nums1[i]=nums[i];
        }
        for(int i=1;i<n;i++){
            nums2[i-1]=nums[i];
        }
        return Math.max(rob1(nums1),rob2(nums2));        
    }
    public int rob1(int[] nums) {
        int a1=0;
        int a2=0;
        for(int i:nums){
            int t=a1;
            a1=Math.max(a2+i,a1);
            a2=t;
        }
        return a1;
    }
    public int rob2(int[] nums) {
        int a1=0;
        int a2=0;
        for(int i:nums){
            int t=a1;
            a1=Math.max(a2+i,a1);
            a2=t;
        }
        return a1;
    }
}