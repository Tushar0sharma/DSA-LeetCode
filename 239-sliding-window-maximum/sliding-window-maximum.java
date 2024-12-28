class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        Deque<Integer>dq=new ArrayDeque<>();
        int j=0;
        int []ans=new int[nums.length-k+1];
        while(j<nums.length){
            while(!dq.isEmpty() && dq.peekFirst()<=j-k){
                dq.pollFirst();
            }
            while(!dq.isEmpty() && nums[dq.peekLast()]<=nums[j]){
                dq.pollLast();
            }
            dq.add(j);
            if(j-k+1>=0){
                ans[j-k+1]=nums[dq.peekFirst()];
            }
            j++;
        }
        return ans;
    }
}