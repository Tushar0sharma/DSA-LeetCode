class Solution {
    public int findMinArrowShots(int[][] points) {
        Arrays.sort(points,(a,b)->Integer.compare(a[0],b[0]));
        int cnt=1;
        int []prev=points[0];
        for(int k=1;k<points.length;k++){
            int []i=points[k];
            if(prev[1]<i[0]){
                cnt++;
                prev=i;
            }
            else{
                prev[0]=Math.max(prev[0],i[0]);
                prev[1]=Math.min(prev[1],i[1]);
            }
        }
        return cnt;
    }
}