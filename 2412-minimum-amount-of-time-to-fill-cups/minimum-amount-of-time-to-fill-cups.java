class Solution {
    public int fillCups(int[] amount) {
        PriorityQueue<Integer>cold=new PriorityQueue<>(Collections.reverseOrder());
        // PriorityQueue<Integer>warm=new PriorityQueue<>(Collections.reverseOrder());
        // PriorityQueue<Integer>hot=new PriorityQueue<>(Collections.reverseOrder());
        if(amount[0]!=0)cold.add(amount[0]);
        if(amount[1]!=0)cold.add(amount[1]);
        if(amount[2]!=0)cold.add(amount[2]);
        int time=0;
        while(!cold.isEmpty()){
            int a=0;
            int b=0;
            if(!cold.isEmpty()) a=cold.poll();
            if(!cold.isEmpty()) b=cold.poll();
            if(a-1>0) cold.add(a-1);
            if(b-1>0) cold.add(b-1);
            time++;
        }
        return time;        
    }
}