class Solution {
    public int numPairsDivisibleBy60(int[] time) {
        int cnt=0;
        int[]v=new int[60];
        for(int num:time){
            int a=num%60;
            if(a==0){
                cnt+=v[a];
            }
            else{
                cnt+=v[60-a];
            }
            v[a]++;
        }
        return cnt;
    }
}