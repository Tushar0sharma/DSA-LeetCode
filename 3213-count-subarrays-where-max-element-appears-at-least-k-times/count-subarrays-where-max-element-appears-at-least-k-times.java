class Solution {
    public long countSubarrays(int[] nums, int k) {
        int max=Arrays.stream(nums).max().getAsInt();
        long ans=0;
        int start=0,element=0;

        for(int i=0;i<nums.length;i++){
            if(nums[i]==max){
                element++;
            }
            while(element==k){
                if(nums[start]==max) element--;
                start++;
            }
            ans+=start;
        }
        return ans;
    }
}