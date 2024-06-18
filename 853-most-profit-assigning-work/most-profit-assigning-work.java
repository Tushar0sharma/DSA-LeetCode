class Solution {
    public int maxProfitAssignment(int[] difficulty, int[] profit, int[] worker) {
        int n=profit.length;
        int [][]arr=new int[n][2];
        for(int i=0;i<n;i++){
            arr[i][0]=difficulty[i];
            arr[i][1]=profit[i];
        }
        Arrays.sort(arr,(a,b)->a[0]-b[0]);
        Arrays.sort(worker);
        int ans=0;
        int idx=0;
        int prof=0;
        for(int i=0;i<worker.length;i++){
            while(idx<n && worker[i]>=arr[idx][0]){
                prof=Math.max(prof,arr[idx][1]);
                idx++;
            }
            ans+=prof;
        }
        return ans;
    }
}