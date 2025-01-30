class Solution {
    public int[] findIntersectionValues(int[] nums1, int[] nums2) {
        int n=nums1.length;
        int m=nums2.length;
        int ans1=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(nums1[i]==nums2[j]){
                    ans1++;break;
                }
            }
        }
        int ans2=0;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(nums1[j]==nums2[i]){
                    ans2++;break;
                }
            }
        }
        return new int[]{ans1,ans2};        
    }
}