class Solution {
    public int minGroups(int[][] intervals) {
        TreeMap<Integer,Integer>mp=new TreeMap<>();
        for(int []i:intervals){
            mp.put(i[0],mp.getOrDefault(i[0],0)+1);
            mp.put(i[1]+1,mp.getOrDefault(i[1]+1,0)-1);
        }
        int max=0,ans=0;
        for(int i:mp.keySet()){
            max+=mp.get(i);
            ans=Math.max(ans,max);
        }
        return ans;
    }
}