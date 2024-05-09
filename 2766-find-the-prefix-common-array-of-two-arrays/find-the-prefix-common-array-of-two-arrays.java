class Solution {
    public int[] findThePrefixCommonArray(int[] a, int[] b) {
        Map<Integer,Integer>mp1=new HashMap<>();
        int []ans=new int[a.length];
        for(int i=0;i<a.length;i++){
            mp1.put(a[i],mp1.getOrDefault(a[i],0)+1);
            mp1.put(b[i],mp1.getOrDefault(b[i],0)+1);
            int cnt=0;
            for(int j:mp1.keySet()){
                if(mp1.get(j)>1 ){
                    cnt++;
                }
            }
            ans[i]=cnt;
        }
        return ans;
    }

}