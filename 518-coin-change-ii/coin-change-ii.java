class Solution {
    public int change(int t, int[] arr) {
        int n=arr.length;
        int [][]dp=new int[n][t+1];
        for(int []i:dp) Arrays.fill(i,-1);
        call(n-1,t,arr,dp);
        return dp[n-1][t];
    }
    public int call(int i,int t,int []arr,int [][]dp){
        if(i==0){
            return dp[i][t]=(t%arr[i]==0)?1:0;
        }
        if(dp[i][t]!=-1) return dp[i][t];
        int nt=call(i-1,t,arr,dp);
        int ta=0;
        if(arr[i]<=t) ta=call(i,t-arr[i],arr,dp);
        return dp[i][t]=nt+ta;
    }
}