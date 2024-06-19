class Solution {
    public int minDays(int[] bloomDay, int m, int k) {
        int start=0;
        int end=0;
        for(int day:bloomDay){
            end=Math.max(day,end);
        }
        int minday=-1;
        while(start<=end){
            int mid=(start+end)/2;
            if(getnum(bloomDay,mid,k)>=m){
                minday=mid;
                end=mid-1;
            }
            else{
                start=mid+1;
            }
        }
        return minday;
    }
    public int getnum(int []bloomday,int mid,int k){
        int cnt=0;
        int num=0;
        for(int i:bloomday){
            if(i<=mid){
                cnt++;
            }
            else{
                cnt=0;
            }
            if(cnt==k){
                num++;
                cnt=0;
            }
        }
        return num;
    }
}