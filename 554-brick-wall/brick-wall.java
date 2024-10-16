class Solution {
    public int leastBricks(List<List<Integer>> wall) {
        Map<Integer,Integer>mp=new HashMap<>();
        for(List<Integer>l:wall){
            int sum=0;
            for(int i=0;i<l.size()-1;i++){
                sum+=l.get(i);
                mp.put(sum,mp.getOrDefault(sum,0)+1);
            }
        }
        int ans=0;
        for(int i:mp.keySet()){
            ans=Math.max(ans,mp.get(i));
        }
        return wall.size()-ans;
    }
}