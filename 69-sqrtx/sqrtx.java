class Solution {
    public int mySqrt(int x) {
        if(x==1) return 1;
        long i=0;
        long j=x/2;
        int ans=x;
        while(i<=j){
            long mid=i+(j-i)/2;
            long val=mid*mid;
            if(val<=x){
                ans=(int)mid;
                i=mid+1;
            }
            else{
                j=mid-1;
            }
        }
        return ans;
    }
}