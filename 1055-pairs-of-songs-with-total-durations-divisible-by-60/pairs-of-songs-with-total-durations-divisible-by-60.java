class Solution {
    public int numPairsDivisibleBy60(int[] time) {
        int []v=new int [60];
        int cnt=0;
        for(int t:time){
            int rem=t%60;
            if(rem==0){
                cnt+=v[rem];
            }
            else{
                cnt+=v[60-rem];
            }
            v[rem]++;
        }
        return cnt;
    }
}