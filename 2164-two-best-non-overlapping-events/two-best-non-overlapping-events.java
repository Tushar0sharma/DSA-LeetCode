class Solution {
    public int maxTwoEvents(int[][] events) {
        Arrays.sort(events,(a,b)->a[0]-b[0]);
        int n=events.length;
        int [][]dp=new int[n][3];
        for(int []i:dp) Arrays.fill(i,-1);
        return call(events,0,0,dp);
    }
    public int call(int [][]event,int i,int cnt,int [][]dp){
        int n=event.length;
        if(i==n || cnt>=2) return 0;
        if(dp[i][cnt]!=-1) return dp[i][cnt];

        int nt=call(event,i+1,cnt,dp);
        int next=search(i,event,event[i][1]);
        int t=call(event,next,cnt+1,dp)+event[i][2];
        return dp[i][cnt]= Math.max(t,nt);
    }
    public int search(int i,int [][]e,int val){
        int l=i+1;
        int r=e.length-1;
        int ans=e.length;
        while(l<=r){
            int mid=(l+r)/2;
            if(e[mid][0]>val)
            {
                ans=mid;
                r=mid-1;
            }
            else{
                l=mid+1;
            }
        }
        return ans;
    }
}