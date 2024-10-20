class Solution {
    public int[] getOrder(int[][] tasks) {
        int n=tasks.length;
        int [][]arr=new int[n][3];
        for(int i=0;i<n;i++){
            arr[i][0]=tasks[i][0];
            arr[i][1]=tasks[i][1];
            arr[i][2]=i;
        }
        Arrays.sort(arr,(a,b)->a[0]-b[0]);
        PriorityQueue<int[]>pq=new PriorityQueue<>((a,b)->a[0]==b[0]?a[1]-b[1]:a[0]-b[0]);
        int idx=0;
        int curr=0;
        int []ans=new int[n];
        int k=0;
        while(idx<n || !pq.isEmpty()){
            if(pq.isEmpty()&&curr<arr[idx][0]){
                curr=arr[idx][0];
            }
            while(idx<n && curr>=arr[idx][0]){
                pq.add(new int[]{arr[idx][1],arr[idx][2]});
                idx++;
            }
            int []p=pq.poll();
            curr+=p[0];
            ans[k++]=p[1];
        }
        return ans;
    }
}