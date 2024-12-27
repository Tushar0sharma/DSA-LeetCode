class Solution {
    public int maxScoreSightseeingPair(int[] values) {
        int max=values[0];
        int ans=0;
        for(int i=1;i<values.length;i++){
            int a=max+values[i]-i;
            ans=Math.max(ans,a);
            max=Math.max(max,values[i]+i);
        }
        return ans;
    }
}