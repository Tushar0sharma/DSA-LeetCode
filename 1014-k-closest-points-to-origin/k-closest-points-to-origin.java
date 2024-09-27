class Solution {
    public int[][] kClosest(int[][] points, int k) {
        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> {
            int first = a[0]*a[0]+a[1]*a[1];
            int second = b[0]*b[0]+b[1]*b[1];
            return Integer.compare(first,second);
        });
        int[][] ans = new int[k][2];
        for (int[] ar : points)
            pq.add(ar);
        int idx = 0;
        while (k-- > 0)
            ans[idx++] = pq.poll();
        return ans;
    }
}
