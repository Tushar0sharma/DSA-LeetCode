class Solution {
    public int minimizedMaximum(int n, int[] quantities) {
        int r=Arrays.stream(quantities).max().getAsInt();
        int l=1;
        int res=0;
        while(l<=r){
            int mid=(l+r)/2;
            if(call(quantities,n,mid)){
                res=mid;
                r=mid-1;
            }
            else l=mid+1;
        }
        return res;
    }
    public boolean call(int []q,int n,int mid){
        for(int i:q){
            // n-=(i+mid-1)/mid; // alternative of math.ceil
            n-=Math.ceil(i/(mid*1.0));
            if(n<0) return false;
        }
        return true;
    }
}