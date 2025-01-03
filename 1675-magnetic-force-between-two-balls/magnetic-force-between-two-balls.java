class Solution {
    public int maxDistance(int[] position, int m) {
        Arrays.sort(position);
        long l=0,r=0;
        for(int i:position) r=Math.max(r,i);
        int ans=-1;
        while(l<=r){
            long mid=(l+r)/2;
            if(call(position,mid,m)){
                ans=(int)mid;
                l=mid+1;
            }
            else r=mid-1;
        }
        return ans;
    }
    public boolean call(int[]arr,long mid,int m){
        int a=arr[0];
        m--;
        int j=1;
        while(j<arr.length && m>0){
            if(arr[j]-a<mid){
                j++;
            }
            else{
                a=arr[j];
                m--;
                j++;
            }
        }
        return m==0;
    }
}