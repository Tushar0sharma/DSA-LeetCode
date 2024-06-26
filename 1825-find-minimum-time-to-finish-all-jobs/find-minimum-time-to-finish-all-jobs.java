class Solution {
    int ans=Integer.MAX_VALUE;
    public int minimumTimeRequired(int[] jobs, int k) {
        call(0,jobs,k,new int[k]);
        return ans;
    }
    public void call(int idx,int []j,int k,int []sum){
        if(idx==j.length){
            int max=0;
            for(int i:sum) max=Math.max(max,i);
            ans=Math.min(max,ans);
            return;
        }
        for(int i=0;i<k;i++){
            sum[i]+=j[idx];
            call(idx+1,j,k,sum);
            sum[i]-=j[idx];
            if(sum[i]==0) break;
        }
        return;
    }
}