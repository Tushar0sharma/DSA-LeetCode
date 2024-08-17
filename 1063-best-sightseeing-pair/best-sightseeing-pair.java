class Solution {
    public int maxScoreSightseeingPair(int[] values) {
        int ans=0;
        int max=0;
        for(int i=0;i<values.length;i++){
            ans=Math.max(ans,max+values[i]-i);
            if(values[i]+i>max) max=values[i]+i;
        }
        return ans;
    }
}