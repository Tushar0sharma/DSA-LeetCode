class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int min=1;
        int max=Arrays.stream(piles).max().getAsInt();
        int res=0;
        while(min<=max){
            int mid=(min+max)/2;
            if(call(piles,h,mid)){
                res=mid;
                max=mid-1;
            }
            else min=mid+1;
        }
        return res;
    }
    public boolean call(int []p,int h,int x){
        for(int i:p){
            h-=(i+x-1)/x;
            if(h<0) return false;
        }
        return true;
    }
}