class Solution {
    public long countCompleteDayPairs(int[] hours) {
        Map<Long,Long>mp=new HashMap<>();
        long cnt=0;
        for(long h:hours){
            long r=h%24;
            if(r==0){
                cnt+=mp.getOrDefault(r,0L);
            }
            else{
                cnt+=mp.getOrDefault(24-r,0L);
            }
            mp.put(r,mp.getOrDefault(r,0L)+1);
        }
        return cnt;
    }
}