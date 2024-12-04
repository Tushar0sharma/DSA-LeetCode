class Solution {
    public int minimumCost(int[] start, int[] target, int[][] specialRoads) {
        PriorityQueue<int[]>pq=new PriorityQueue<>((a,b)->a[2]-b[2]);
        pq.add(new int[]{start[0],start[1],0});
        Set<String>vis=new HashSet<>();
        while(!pq.isEmpty()){
            int []p=pq.poll();
            int r=p[0];
            int c=p[1];
            if(vis.contains(r+","+c)) continue;
            vis.add(r+","+c);
            int w=p[2];
            if(r==target[0] && c==target[1]) return w;
            for(int []i:specialRoads){
                int a=Math.abs(i[0]-r)+Math.abs(i[1]-c);
                a+=i[4]+w;
                pq.add(new int[]{i[2],i[3],a});
            }
            pq.add(new int[]{target[0],target[1],Math.abs(target[0]-r)+Math.abs(target[1]-c)+w});
        }
        return -1;
    }
}