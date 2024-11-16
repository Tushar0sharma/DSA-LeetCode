class Solution {
    public int[] resultsArray(int[] nums, int k) {
        int n=nums.length;
        int []res=new int[n-k+1];
        for(int i=0;i<n-k+1;i++){
            int max=nums[i];
            for(int j=i;j<i+k-1;j++){
                if(nums[j]+1!=nums[j+1]){
                    max=-1;
                    break;
                }
                max=Math.max(nums[j+1],max);
            }
            res[i]=max;
        }
        return res;
    }
}