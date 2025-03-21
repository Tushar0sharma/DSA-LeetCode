class Solution {
    public int findMaximizedCapital(int k, int w, int[] profits, int[] capital) {
        int n=profits.length;
        int [][]arr=new int[n][2];
        for(int i=0;i<n;i++){
            arr[i][0]=profits[i];
            arr[i][1]=capital[i];
        }
        Arrays.sort(arr,(a,b)->a[1]-b[1]);
        int i=0;
        PriorityQueue<Integer>pq=new PriorityQueue<>(Collections.reverseOrder());
        while(k-->0){
            while(i<n && arr[i][1]<=w){
                pq.add(arr[i][0]);
                i++;
            }
            if(pq.isEmpty()) break;
            w+=pq.poll();
        }
        return w;
    }
}