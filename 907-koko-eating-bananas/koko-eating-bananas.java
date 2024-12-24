class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int i= 1;
        int ans=0;
        int max=-1;
        for(int k:piles) max=Math.max(max,k);
        int j=max;
        while(i<=j){
            int mid=(i+j)/2;
            if(call(piles,mid)<=h){
                ans=mid;
                j=mid-1;
            }
            else i=mid+1;
        }
        return ans;
    }
    public int call(int []piles,int h){
        int a=0;
        for(int i:piles){
            a+=Math.ceil((double)i/h);
        }
        return a;
    }
}