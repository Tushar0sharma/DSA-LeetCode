class Solution {
    public int largestCombination(int[] candidates) {
        int max=0;
        for(int i=0;i<=24;i++){
            int cnt=0;
            for(int j:candidates){
                if((j&(1<<i))!=0) cnt++;
            }
            max=Math.max(cnt,max);
        }
        return max;
    }
}