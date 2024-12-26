class Solution {
    public long minimalKSum(int[] nums, int k) {
        long sum=(long)k*(k+1)/2;
        Set<Integer>s=new TreeSet<>();
        for(int i:nums) s.add(i);
        for(int i:s){
            if(i<=k) sum+=(++k)-i;
        }
        return sum;
    }
}