class Solution {
    public int findMinArrowShots(int[][] points) {
        Arrays.sort(points,(a,b)->Integer.compare(a[0],b[0]));
        int []prev=points[0];
        int ans=1;
        for(int i=1;i<points.length;i++){
            if(points[i][0]>prev[1]){
                ans++;
                prev=points[i];
            }
            else{
                prev[1]=Math.min(prev[1],points[i][1]);
            }
        }
        return ans;
    }
}