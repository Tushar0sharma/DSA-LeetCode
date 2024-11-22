class Solution {
    public int maxUncrossedLines(int[] nums1, int[] nums2) {
        int n=nums1.length;
        int m=nums2.length;
        int [][]dp=new int [n][m];
        for( int[]i:dp) Arrays.fill(i,-1);
        call(dp,0,0,n,m,nums1,nums2) ;
        return dp[0][0];  
    }
    public int call(int [][]dp,int i,int j,int n,int m,int[]nums1,int []nums2){
        if(i==n || j==m) return 0;
        if(dp[i][j]!=-1) return dp[i][j];
        int ans=0;
        if(nums1[i]==nums2[j]){
            ans=1+call(dp,i+1,j+1,n,m,nums1,nums2);
        }
        else{
            ans=Math.max(call(dp,i+1,j,n,m,nums1,nums2),call(dp,i,j+1,n,m,nums1,nums2));
        }
        return dp[i][j]=ans;
    }
}