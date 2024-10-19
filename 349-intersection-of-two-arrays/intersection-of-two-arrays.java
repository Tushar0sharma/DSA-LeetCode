class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        List<Integer>l=new ArrayList<>();
        Set<Integer>s1=new HashSet<>();
        for(int i:nums1) s1.add(i);
        Set<Integer>s2=new HashSet<>();
        for(int i:nums2){
            if(!s2.contains(i) && s1.contains(i)) {
                s2.add(i);
                l.add(i);
            }
        }
        int []ans=new int[l.size()];
        int k=0;
        for(int i:l) ans[k++]=i;
        return ans;
    }
}