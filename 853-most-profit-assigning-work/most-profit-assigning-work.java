class Solution {
    public int maxProfitAssignment(int[] difficulty, int[] profit, int[] worker) {
        int n=profit.length;
        int [][]l=new int[n][2];
        for(int i=0;i<n;i++){
            l[i][0]=difficulty[i];
            l[i][1]=profit[i];
        }
        Arrays.sort(l,(a,b)->a[0]-b[0]);
        Arrays.sort(worker);
        int ans=0;
        int p=0;
        int j=0;
        for(int i=0;i<worker.length;i++){
            while(j<n && worker[i]>=l[j][0]){
                p=Math.max(p,l[j++][1]);
            }
            ans+=p;
        }
        return ans;
    }
}