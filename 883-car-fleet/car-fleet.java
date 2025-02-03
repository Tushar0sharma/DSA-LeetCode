class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
        int n=position.length;
        Double [][]arr=new Double[n][2];
        for(int i=0;i<n;i++){
            arr[i][0]=(double)position[i];
            arr[i][1]=(double)(target-position[i])/speed[i];
        }
        Arrays.sort(arr,(a,b)->Double.compare(a[0],b[0]));
        int cnt=0;
        double prev=0;
        for(int i=n-1;i>=0;i--){
            if(arr[i][1]>prev){ cnt++;prev=arr[i][1];}
        }
        return cnt;
    }
}