class Solution {
    public int[] findIntersectionValues(int[] nums1, int[] nums2) {
        int n=nums1.length;
        int m=nums2.length;
        Map<Integer,Integer>mp1=new HashMap<>();
        Map<Integer,Integer>mp2=new HashMap<>();
        
        for(int i=0;i<n;i++){
            mp1.put(nums1[i],mp1.getOrDefault(nums1[i],0)+1);
        }
        for(int i=0;i<m;i++){
            mp2.put(nums2[i],mp2.getOrDefault(nums2[i],0)+1);
        }
        int ans1=0;
        for(int i=0;i<n;i++){
            if(mp2.containsKey(nums1[i])){
                ans1++;
            }
        }
        int ans2=0;
        for(int i=0;i<m;i++){
            if(mp1.containsKey(nums2[i])){
                ans2++;
            }
        }
        return new int[]{ans1,ans2};        
    }
}