class Solution {
    public int timeRequiredToBuy(int[] t, int k) {
        int cnt=0;
        while(t[k]!=0){
            for(int i=0;i<t.length;i++){
                if(t[i]>0){
                    cnt++;
                    t[i]=t[i]-1;
                }
                if(t[k]==0) return cnt;
            }
        }
        return cnt;
    }
}