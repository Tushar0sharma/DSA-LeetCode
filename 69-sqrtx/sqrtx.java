class Solution {
    public int mySqrt(int x) {
        if(x==0){
            return 0;
        }
        int start =1;
        int end=x;
        while(start<=end){
            int mid=start+(end-start)/2;
            if((long)mid*mid > (long)x){
                end=mid-1;
            }
            else if(mid*mid==x) return mid;
            else start=mid+1;
        }
        return Math.round(end);
    }
}