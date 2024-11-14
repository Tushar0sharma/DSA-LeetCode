class Solution {
    public int smallestDivisor(int[] nums, int threshold) {
        int max=Arrays.stream(nums).max().getAsInt();
        int min=1;
        int res=0;
        while(min<=max){
            int mid=(min+max)/2;
            if(call(mid,threshold,nums)){
                res=mid;
                max=mid-1;
            }
            else min=mid+1;
        }
        return res;
    }
    public boolean call(int mid,int h,int []n){
        for(int i:n){
            h-=(i+mid-1)/mid;
            if(h<0) return false;
        }
        return true;
    }
}