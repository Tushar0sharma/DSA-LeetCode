class Solution {
    public int[] answerQueries(int[] nums, int[] queries) {
        int []ans=new int[queries.length];
        Arrays.sort(nums);
        int j=0;
        for(int k:queries){
            int sum=0;
            int cnt=0;
                for(int i=0;i<nums.length;i++){
                    sum+=nums[i];
                    if(sum<=k){
                        cnt++;
                    } 
                    else{
                        break;
                    }
                }
            ans[j++]=cnt;
        }
        return ans;
    }
}