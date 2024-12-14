class Solution {
    public long continuousSubarrays(int[] nums) {
        long ans=0;
        Deque<Integer>min=new ArrayDeque<>();
        Deque<Integer>max=new ArrayDeque<>();
        int l=0;
        for(int r=0;r<nums.length;r++){
            while(!min.isEmpty() && nums[min.peekLast()]>nums[r]){
                min.pollLast();
            }
            min.addLast(r);
            while(!max.isEmpty() && nums[max.peekLast()]<nums[r]){
                max.pollLast();
            }
            max.addLast(r);
            while(!min.isEmpty() && !max.isEmpty() && nums[max.peekFirst()]-nums[min.peekFirst()]>2){
                if(min.peekFirst()>max.peekFirst()){
                    l=max.peekFirst()+1;
                    max.pollFirst();
                }
                else{
                    l=min.peekFirst()+1;
                    min.pollFirst();
                }
            }
            ans+=r-l+1;
        }
        return ans;
    }
}