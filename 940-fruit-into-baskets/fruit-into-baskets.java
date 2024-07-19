class Solution {
    public int totalFruit(int[] fruits) {
        Map<Integer,Integer>mp=new HashMap<>();
        int ans=0;
        int st=0;
        for(int i=0;i<fruits.length;i++){
            mp.put(fruits[i],mp.getOrDefault(fruits[i],0)+1);
            while(mp.size()>2){
                mp.put(fruits[st],mp.getOrDefault(fruits[st],0)-1);
                mp.remove(fruits[st],0);
                st++;
            }
            ans=Math.max(ans,i-st+1);
        }
        return ans;
    }
}