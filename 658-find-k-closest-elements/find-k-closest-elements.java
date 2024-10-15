class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        List<Integer>l=new ArrayList<>();
        PriorityQueue<int []>pq=new PriorityQueue<>((a,b)->{
            if(a[0]==b[0]){
                return a[1]-b[1];
            }
            return a[0]-b[0];
        });
        for(int i:arr){
            pq.add(new int[]{Math.abs(x-i),i});
        }
        while(k-->0){
            l.add(pq.poll()[1]);
        }
        Collections.sort(l);
        return l;
    }
}