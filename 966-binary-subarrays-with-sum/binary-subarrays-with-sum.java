class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
        return atmost(nums,goal)-atmost(nums,goal-1);
    }
    public int atmost(int[] a,int g){
        int start=0;
        int total=0;
        int curr=0;
        for(int end=0;end<a.length;end++){
            curr+=a[end];
            while(start<=end && curr>g){
                curr-=a[start++];
            }
            total+=end-start+1;
        }
        return total;
    }
}