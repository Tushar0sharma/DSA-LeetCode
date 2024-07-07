class Solution {
    public int numWaterBottles(int b, int e) {
        int cnt=b;
        while(b>=e){
            int a=b%e;
            b=b/e;
            cnt+=b;
            b+=a;
        }
        return cnt;
    }
}