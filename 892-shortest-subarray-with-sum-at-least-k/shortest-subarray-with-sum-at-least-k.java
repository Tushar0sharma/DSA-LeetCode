class Solution {
    public int shortestSubarray(int[] nums, int k) {
        int n=nums.length;
        int ans=Integer.MAX_VALUE;
        long[]currsum=new long[n];
        Deque<Integer>d=new ArrayDeque<>();
        for(int i=0;i<n;i++){
            if(i==0){
                currsum[i]=nums[i];
            }
            else{
                currsum[i]=currsum[i-1]+nums[i];
            }
            if(currsum[i]>=k){
                ans=Math.min(ans,i+1);
            }
            while(!d.isEmpty() && currsum[i]-currsum[d.getFirst()]>=k){
                ans=Math.min(ans,i-d.getFirst());
                d.pollFirst();
            }
            while(!d.isEmpty() && currsum[i]<=currsum[d.getLast()]){
                d.pollLast();
            }
            d.add(i);
        }
        return ans==Integer.MAX_VALUE?-1:ans;
    }
}