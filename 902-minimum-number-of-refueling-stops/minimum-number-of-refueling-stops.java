class Solution {
    public int minRefuelStops(int target, int startfuel, int[][] stations) {
        PriorityQueue<Integer>pq=new PriorityQueue<>(Collections.reverseOrder());
        int stop=0;
        int i=0;
        for(stop=0;startfuel<target;stop++){
            while(i<stations.length && startfuel>=stations[i][0]){
                pq.add(stations[i][1]);
                i++;
            }
            if(pq.isEmpty()) return -1;
            startfuel+=pq.poll();

        }
        return stop;
    }
}