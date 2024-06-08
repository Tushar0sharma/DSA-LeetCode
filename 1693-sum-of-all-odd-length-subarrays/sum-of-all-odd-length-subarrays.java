class Solution {
    public int sumOddLengthSubarrays(int[] arr) {
        int n=arr.length,ans=0;

        for(int i=0;i<n;i++){
            int curr=0;
            for(int j=i;j<n;j++){
                curr+=arr[j];
                ans+=(j-i+1)%2==1?curr:0;
            }
        }
        return ans;
    }
}