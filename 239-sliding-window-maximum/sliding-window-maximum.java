class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int n=nums.length;
        int []ans=new int[n-k+1];
        Deque<Integer>dq=new ArrayDeque<>();
        for(int i=0;i<n;i++){
            while(!dq.isEmpty() && i-k>=dq.peekFirst()){
                dq.pollFirst();
            }
            while(!dq.isEmpty() && nums[dq.peekLast()]<nums[i]){
                dq.pollLast();
            }
            dq.add(i);
            if(i-k+1>=0){
                ans[i-k+1]=nums[dq.peekFirst()];
            }
        }
        return ans;
    }
}