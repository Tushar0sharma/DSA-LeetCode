class Solution {
    public int arrangeCoins(int n) {
        long l=1,r=n;
        while(l<=r){
            long mid=(l+r)/2;
            if(call(mid,n)==n){
                return (int)mid;
            }
            else if(call(mid,n)>n){
                r=mid-1;
            }
            else{
                l=mid+1;
            }
        }
        return (int)r;
    }
    public long call(long a,int n){
        long k=(a*(a+1))/2;
        return k;
    }
}