class Solution {
    public int xorAllNums(int[] nums1, int[] nums2) {
        int n=nums1.length;
        int m=nums2.length;
        int xor=0;
        if(m%2!=0){
            for(int i:nums1) xor^=i;
        }
        if(n%2!=0){
            for(int i:nums2) xor^=i;
        }
        return xor;
    }
}