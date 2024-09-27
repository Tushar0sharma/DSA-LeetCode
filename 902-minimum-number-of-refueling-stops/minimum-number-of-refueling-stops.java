class Solution {
    public int minRefuelStops(int target, int startfuel, int[][] stations) {
        PriorityQueue<Integer>pq=new PriorityQueue<>(Collections.reverseOrder());
        int stop=0;
        int i=0;
        while(startfuel<target){
            while(i<stations.length && startfuel>=stations[i][0]){
                pq.add(stations[i][1]);
                i++;
            }
            if(pq.isEmpty()) return -1;
            startfuel+=pq.poll();
            stop++;
        }
        return stop;
    }
}