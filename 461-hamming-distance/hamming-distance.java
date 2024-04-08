class Solution {
    public int hammingDistance(int x, int y) {
        int res=0;
        int r=x^y;
        while(r!=0){
            res+=r%2;
            r/=2;
        }
        return res;
    }
}