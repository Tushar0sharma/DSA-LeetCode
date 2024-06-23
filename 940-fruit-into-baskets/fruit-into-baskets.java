class Solution {
    public int totalFruit(int[] fruits) {
        Map<Integer,Integer>mp=new HashMap<>();
        int i=0,j=0,ans=0;
        while(i<fruits.length){
            mp.put(fruits[i],mp.getOrDefault(fruits[i],0)+1);
            while(mp.size()>2){
                mp.put(fruits[j],mp.getOrDefault(fruits[j],0)-1);
                mp.remove(fruits[j],0);
                j++;
            }
            ans=Math.max(ans,i-j+1);
            i++;
        }
        return ans;
    }
}