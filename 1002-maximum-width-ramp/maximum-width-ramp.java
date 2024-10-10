class Solution {
    public int maxWidthRamp(int[] nums) {
        int n=nums.length;
        Stack<Integer>s=new Stack<>();
        for(int i=0;i<n;i++){
            if(s.isEmpty()|| nums[s.peek()]>nums[i]){
                s.push(i);
            }
        }
        int ans=0;
        for(int i=n-1;i>=0;i--){
            while(!s.isEmpty() && nums[s.peek()]<=nums[i]){
                ans=Math.max(ans,i-s.pop());
            }
        }
        return ans;
    }
}