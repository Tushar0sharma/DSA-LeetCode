class Solution {
    public int maximumCandies(int[] candies, long k) {
        int l=1;
        int r=0;
        for(int i:candies) r=Math.max(r,i);
        int ans=0;
        while(l<=r){
            int mid=(l+r)/2;
            if(possible(candies,mid,k)){
                ans=mid;
                l=mid+1;
            }
            else{
                r=mid-1;
            }
        }
        return ans;
    }
    public boolean possible(int[]nums,int mid,long k){
        long cnt=0;
        for(int i:nums){
            cnt+=i/mid;
        }
        return cnt>=k;
    }
}