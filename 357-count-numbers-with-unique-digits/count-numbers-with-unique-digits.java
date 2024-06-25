class Solution {
    public int countNumbersWithUniqueDigits(int n) {
        return call(n,0,new boolean[10]);
    }
    public int call(int n,int start,boolean[]b){
        if(start==n) return 1;
        int cnt=1;
        for(int i=(start==0?1:0);i<=9;i++){
            if(!b[i]){
                b[i]=true;
                cnt+=call(n,start+1,b);
                b[i]=false;
            }
        }
        return cnt;
    }
}