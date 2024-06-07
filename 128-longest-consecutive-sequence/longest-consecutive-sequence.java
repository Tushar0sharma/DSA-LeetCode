class Solution {
    public int longestConsecutive(int[] nums) {
        int n=nums.length;
        if(n==0) return 0;
        Arrays.sort(nums);
        int cons=0;
        int curr=1;
        for(int i=1;i<n;i++){
            if(nums[i-1]!=nums[i]){   
                if(nums[i-1]+1==nums[i]){
                    curr++;
                }
                else{
                    cons=Math.max(curr,cons);
                    curr=1;
                }
            }
        }
        return Math.max(curr,cons);
    }
}