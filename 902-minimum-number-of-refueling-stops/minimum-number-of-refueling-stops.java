class Solution {
    public int minRefuelStops(int target, int startFuel, int[][] stations) {
        int i=0;
        int far=startFuel,cnt=0;
        PriorityQueue<Integer>pq=new PriorityQueue<>(Collections.reverseOrder());
        while(far<target){
            while(i<stations.length && stations[i][0]<=far){
                pq.add(stations[i][1]);
                i++;
            }
            if(pq.isEmpty()) return -1;
            far+=pq.poll();
            cnt++;
        }
        return cnt;
    }
}