class Solution {
    public long minimumTime(int[] time, int totalTrips) {
        long ans=-1;
        long l=Long.MAX_VALUE;
        long r=0;
        for(int i:time){
            l=Math.min(l,i);
            r=Math.max(r,i);
        }
        r*=totalTrips;
        while(l<=r){
            long mid=l+(r-l)/2;
            if(call(time,mid,totalTrips)){
                ans=mid;
                r=mid-1;
            }
            else{
                l=mid+1;
            }
        }
        return ans;
    }
    public boolean call(int []t,long mid,int a){
        long j=0;
        for(int i:t){
            j+=(mid/i);
        }
        return j>=a;
    }
}