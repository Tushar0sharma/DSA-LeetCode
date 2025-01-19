class Solution {
    public int minMaxSums(int[] nums, int k) {
         Arrays.sort(nums);
        int mod=(int)1e9+7;
        int n=nums.length;
        int [][]arr=new int[n+1][k+1];
        for(int i=0;i<=n;i++){
            arr[i][0]=1;
        }
        for(int i=1;i<=n;i++){
            for(int j=1;j<=k;j++){
                arr[i][j]=(arr[i-1][j-1]+arr[i-1][j])%mod;
            }
        }
        long total=0;

        for(int i=0;i<n;i++){
            for(int j=1;j<=k;j++){
                if(i>=j-1){
                    total+=(long)nums[i]*arr[i][j-1]%mod;
                    total%=mod;
                }
            }
            for(int j=1;j<=k;j++){
                if(n-i-1>=j-1){
                    total+=(long)nums[i]*arr[n-i-1][j-1]%mod;
                    total%=mod;
                }
            }
        }
        return (int)(total%mod) ;
    }
}