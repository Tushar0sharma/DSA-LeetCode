class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int l=1;
        int r=0;
        for(int i:weights){
            r+=i;
            l=Math.max(l,i);
        }
        int ans=-1;
        while(l<=r){
            int mid=(l+r)/2;
            if(possible(mid,weights,days)){
                ans=mid;
                r=mid-1;
            }
            else l=mid+1;
        }
        return ans;
    }
    public boolean possible(int mid,int[]a,int day){
        int sum=0;
        int cnt=1;
        for(int i:a){
            sum+=i;
            if(sum>mid){
                cnt++;
                sum=i;
            }
        }
        return cnt<=day;
    }
}