class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        PriorityQueue<int[]> pq=new PriorityQueue<>((a,b)->{
            if(a[0]==b[0]) return a[1]-b[1];
            else return a[0]-b[0];
        });
        List<Integer> ans=new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            pq.add(new int[]{Math.abs(x-arr[i]),arr[i]});
        }
        for(int i=0;i<k;i++){
            ans.add(pq.poll()[1]);
        }
        Collections.sort(ans);
        return ans;
    }
}
