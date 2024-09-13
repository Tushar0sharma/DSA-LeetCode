class Solution {
    public List<Integer> largestDivisibleSubset(int[] nums) {
        List<Integer>l=new ArrayList<>();
        int n=nums.length;
        int []dp=new int[n+1];
        Arrays.sort(nums);
        int []hash=new int[n];
        Arrays.fill(dp,1);
        int max=0;
        int last=0;
        for(int i=0;i<n;i++){
            hash[i]=i;
            for(int j=0;j<i;j++){
                if(nums[i]%nums[j]==0 && dp[i]<dp[j]+1){
                    dp[i]=dp[j]+1;
                    hash[i]=j;
                }
            }
            if(dp[i]>max){
                max=dp[i];
                last=i;
            }
        }
        l.add(nums[last]);
        while(hash[last]!=last){
            last=hash[last];
            l.add(nums[last]);
        }
        Collections.reverse(l);
        return l;
    }
}