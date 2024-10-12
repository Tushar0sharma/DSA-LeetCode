class Solution {
    public int findMinArrowShots(int[][] points) {
        Arrays.sort(points,(a,b)->Integer.compare(a[1], b[1]));
        int cnt=1;
        int prev=points[0][1];
        for(int k=1;k<points.length;k++){
            int []i=points[k];
            if(prev<i[0]){
                cnt++;
                prev=i[1];
            }
        }
        return cnt;
    }
}