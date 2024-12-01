class Solution {
    public int getLargestOutlier(int[] nums) {
        long sum=0;
        Map<Integer,Integer>mp=new HashMap<>();
        for(int i:nums){
            mp.put(i,mp.getOrDefault(i,0)+1);
            sum+=i;
        }
        int outlier=Integer.MIN_VALUE;
        for(int i:nums){
            long req=sum-i;
            if(req%2==0){
                long l=req/2;
                mp.put(i,mp.get(i)-1);
                if(mp.containsKey((int)l) && mp.get((int)l)>0){
                    outlier=Math.max(outlier,i);
                }      
                mp.put(i,mp.get(i)+1);
            }
        }
        return outlier;
    }
}