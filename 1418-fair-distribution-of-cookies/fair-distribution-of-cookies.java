class Solution {
    int ans=Integer.MAX_VALUE;
    public int distributeCookies(int[] cookies, int k) {
        call(0,cookies,k,new int[k]);
        return ans;
    }
    public void call(int s,int []c,int k,int []sum){
        if(s==c.length){
            int max=0;
            for(int i:sum){
                max=Math.max(max,i);
            }
            ans=Math.min(ans,max);
            return;
        }
        for(int i=0;i<k;i++){
            sum[i]+=c[s];
            call(s+1,c,k,sum);
            sum[i]-=c[s];
        }
        return;
    }
}