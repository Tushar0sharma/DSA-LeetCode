class Solution {
    public int[] nextGreaterElements(int[] nums) {
        Stack<Integer>st=new Stack<>();
        int[] ans=new int[nums.length];
        for(int i=nums.length-1;i>=0;i--){
            while(!st.isEmpty() && st.peek()<=nums[i]){
                st.pop();
            }
            if(st.isEmpty()){
                int max=-1;
                for(int k=0;k<nums.length;k++){
                    if(nums[k]>nums[i]){
                        max=nums[k];
                        break;
                    }
                }
                ans[i]=max;
            }
            else{
                ans[i]=st.peek();
            }
            st.push(nums[i]);
        }
        return ans;
    }
}