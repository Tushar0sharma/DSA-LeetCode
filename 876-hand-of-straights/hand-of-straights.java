class Solution {
    public boolean isNStraightHand(int[] hand, int groupSize) {
        if(hand.length%groupSize !=0) return false;
        Map<Integer,Integer>mp=new HashMap<>();
        for(int num:hand){
            mp.put(num,mp.getOrDefault(num,0)+1);
        }
        Arrays.sort(hand);
        for(int i=0;i<hand.length;i++){
            if(mp.get(hand[i])==0) continue;
            for(int j=0;j<groupSize;j++){
                int curr=hand[i]+j;
                if(mp.getOrDefault(curr,0)==0) return false;
                mp.put(curr,mp.get(curr)-1);
            }
        }
        return true;
    }
}