class Solution {
    public int nonSpecialCount(int l, int r) {
        int cnt=0;
        for(int i=1;i<=r;i++){
            if((check(i) && i!=1) || i==2){
                if(i*i>=l && i*i<=r) cnt++;
                else if(i*i>r) break;
            }
        }
        return r-l+1-cnt;
    }
    public boolean check(int num){
        for(int i=2;i<=Math.sqrt(num);i++){
            if(num%i==0) return false;
        }
        return true;
    }
}