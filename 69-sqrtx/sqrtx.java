class Solution {
    public int mySqrt(int x) {
        long i=0;
        long j=x;
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