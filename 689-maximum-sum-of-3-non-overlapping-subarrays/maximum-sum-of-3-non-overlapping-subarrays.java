class Solution {
    int [][]dp=new int[20001][4];
    public int[] maxSumOfThreeSubarrays(int[] nums, int k) {
        List<Integer>ans=new ArrayList<>();
        for(int[]i:dp) Arrays.fill(i,-1);
        int n=nums.length-k+1;
        int []sum=new int[n];
        int i=0,j=0,window=0;
        while(j<nums.length){
            window+=nums[j];
            if(j-i+1==k){
                sum[i]=window;
                window-=nums[i];
                i++;
            }
            j++;
        }
        solve(sum,0,k,ans,3);
        int []aa=new int [3];
        for(int a=0;a<3;a++) aa[a]=ans.get(a);
        return aa;
    }
    public int helper(int []sum,int i,int k,List<Integer>ans,int cnt,int [][]dp){
        if(cnt==0) return 0;
        if(i>=sum.length) return Integer.MIN_VALUE;
        if(dp[i][cnt]!=-1) return dp[i][cnt];
        int take=sum[i]+helper(sum,i+k,k,ans,cnt-1,dp);
        int nottake=helper(sum,i+1,k,ans,cnt,dp);
        return dp[i][cnt]=Math.max(take,nottake);        
    }
    public void solve(int []sum,int i,int k,List<Integer>ans,int cnt){
        if(cnt==0) return ;
        if(i>=sum.length) return;

        int take=sum[i]+helper(sum,i+k,k,ans,cnt-1,dp);
        int nottake=helper(sum,i+1,k,ans,cnt,dp);
        if(take>=nottake){
            ans.add(i);
            solve(sum,i+k,k,ans,cnt-1);
        }
        else{
            solve(sum,i+1,k,ans,cnt);
        }
        
    }
}