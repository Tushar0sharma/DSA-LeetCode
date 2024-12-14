class Solution {
    public long continuousSubarrays(int[] nums) {
        long ans=0;
        PriorityQueue<Integer>min=new PriorityQueue<>();
        PriorityQueue<Integer>max=new PriorityQueue<>(Collections.reverseOrder());
        int l=0;
        for(int r=0;r<nums.length;r++){
            min.add(nums[r]);
            max.add(nums[r]);
            while((max.peek()-min.peek(            ))>2){
                min.remove(nums[l]);
                max.remove(nums[l]);
                l++;
            }
            ans+=(r-l+1);
        }
        return ans;
    }
}