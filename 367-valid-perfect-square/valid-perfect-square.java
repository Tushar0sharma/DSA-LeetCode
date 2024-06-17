class Solution {
    public boolean isPerfectSquare(int num) {
        if(num==0 || num==1) return true;
        int start=1;
        int end=num;
        while(start<=end){
            int mid=(end-start)/2+start;
            if((long)mid*mid>(long)num){
                end=mid-1;
            }
            else if(mid*mid==num){
                return true;
            }
            else{
                start=mid+1;
            }
        }
        return false;
    }
}