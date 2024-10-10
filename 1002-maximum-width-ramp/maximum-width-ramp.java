class Solution {
    public int maxWidthRamp(int[] nums) {
        int n=nums.length;
        Integer[] idx = new Integer[n];
        for(int i=0;i<n;i++) idx[i]=i;
        Arrays.sort(idx,(i,j)->nums[i]!=nums[j]?nums[i]-nums[j]:i-j);
        int min=n;
        int ans=0;
        for(int i:idx){
            min=Math.min(i,min);
            ans=Math.max(ans,i-min);
        }
        return ans;
    }
}