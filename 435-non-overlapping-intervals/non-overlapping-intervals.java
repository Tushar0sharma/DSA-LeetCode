class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        Arrays.sort(intervals,(a,b)->a[1]-b[1]);
        int cnt=1;
        int prev=intervals[0][1];
        for(int k=1;k<intervals.length;k++){
            int []i=intervals[k];
            if(i[0]>=prev){
                cnt++;
                prev=i[1];
            }
        }
        return intervals.length-cnt;
    }
}