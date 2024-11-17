class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        Deque<Integer>d=new LinkedList<>();
        int n=nums.length;
        long[]currsum=new long[n];
        int ans=Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            if(i==0) currsum[i]=nums[i];
            else currsum[i]=currsum[i-1]+nums[i];
            if(currsum[i]>=target){
                ans=Math.min(ans,i+1);
            }
            while(!d.isEmpty() && currsum[i]-currsum[d.getFirst()]>=target){
                ans=Math.min(ans,i-d.pollFirst());
            }
            while(!d.isEmpty() && currsum[i]<=currsum[d.getLast()]){
                d.pollLast();
            }
            d.add(i);
        }
        return ans==Integer.MAX_VALUE?0:ans;
    }
}