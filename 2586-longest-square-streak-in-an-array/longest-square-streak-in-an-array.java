class Solution {
    public int longestSquareStreak(int[] nums) {
        Set<Integer>s=new HashSet<>();
        for(int i:nums) s.add(i);
        int max=1;
        for(int i:nums){
            int c=0;
            long k=i;
            while(s.contains((int)k)){
                c++;
                k=k*k;
                if(k>1e5) break;
            }
            max=Math.max(max,c);
        }
        return max==1?-1:max;
    }
}