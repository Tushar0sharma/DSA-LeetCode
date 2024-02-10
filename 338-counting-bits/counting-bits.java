class Solution {
    public int[] countBits(int n) {
        int[]cnt=new int[n+1];
        cnt[0]=0;
        for(int i=1;i<cnt.length;i++){
            if(i%2==0){
                cnt[i]=cnt[i>>1];
            }
            else{
                cnt[i]=cnt[i-1]+1;
            }
        }
        return cnt;
        
    }
}