class Solution {
    public int hIndex(int[] citations) {
        int n=citations.length;
        int ans=0;
        Arrays.sort(citations);
        for(int i=0;i<n;i++){
            if(citations[i]>=n-i){
                return n-i;
            }
        }
        return ans;
    }
}