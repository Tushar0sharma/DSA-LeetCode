class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        Map<Integer,Integer>mp=new HashMap<>();
        for(int i:nums1){
            mp.put(i,mp.getOrDefault(i,0)+1);
        }
        List<Integer>l=new ArrayList<>();
        for(int i:nums2){
            if(mp.get(i)!=null && mp.get(i)>0){
                l.add(i);
                mp.put(i,mp.get(i)-1);
            }
        }
        int []ans=new int [l.size()];
        for(int i=0;i<l.size();i++){
            ans[i]=l.get(i);
        }
        return ans;
    }
}