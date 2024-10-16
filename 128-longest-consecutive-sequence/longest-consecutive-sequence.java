class Solution {
    public int longestConsecutive(int[] nums) {
        Map<Integer,Boolean>mp=new HashMap<>();
        for(int i:nums){
            if(mp.containsKey(i-1)){
                mp.put(i,false);
            }
            else{
                mp.put(i,true);
            }
            if(mp.containsKey(i+1)){
                mp.put(i+1,false);
            }
        }
        int ans=0;
        for(int i:mp.keySet()){
            if(mp.get(i)){
                int a=1;
                while(mp.containsKey(i+1)){
                    i++;
                    a++;
                }
                ans=Math.max(ans,a);
            }
        }
        return ans;
    }
}