class Solution {
    public boolean canPartitionKSubsets(int[] nums, int k) {
        Arrays.sort(nums);
        int sum=0;
        for(int i:nums) sum+=i;
        if(sum%k!=0 || nums.length<k) return false;
        return call(nums,sum/k,nums.length-1,new int[k]);
    }
    public boolean call(int []nums,int t,int idx,int[]sum){
        if(idx==-1){
            // for (int s:sum) {
            //     if(s!=t) return false;
            // }
            return true;
        }
        for(int i=0;i<sum.length;i++){
            if(nums[idx]+sum[i]<=t){
                sum[i]+=nums[idx];
                if(call(nums,t,idx-1,sum)) return true;
                sum[i]-=nums[idx];   
            } 
            if(sum[i]==0) break;
        }
        return false;
    }
}