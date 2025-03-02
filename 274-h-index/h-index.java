class Solution {
    public int hIndex(int[] citations) {
        int n=citations.length;
        int []cnt=new int[n+1];
        for(int i=0;i<n;i++){
            if(citations[i]<n) cnt[citations[i]]++;
            else cnt[n]++;
        }
        int ans=0;
        for(int i=n;i>=0;i--){
            ans+=cnt[i];
            if(ans>=i) return i;
        }
        return 0;
    }
}