class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals,(a,b)->a[0]-b[0]);
        LinkedList<int[]>l=new LinkedList<>();
        for(int []interval:intervals){
            if(l.isEmpty() || l.getLast()[1]<interval[0]){
                l.add(interval);
            }
            else{
                l.getLast()[1]=Math.max(l.getLast()[1],interval[1]);
            }
        }
        return l.toArray(new int[l.size()][]);
    }
}