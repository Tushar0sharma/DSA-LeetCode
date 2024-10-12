class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        Arrays.sort(intervals,(a,b)->a[1]-b[1]);
        int cnt=0;
        int prev=intervals[0][1];
        for(int k=1;k<intervals.length;k++){
            int []i=intervals[k];
            if(i[0]>=prev){
                prev=i[1];
            }
            else{
                cnt++;
            }
        }
        return cnt;
    }
}