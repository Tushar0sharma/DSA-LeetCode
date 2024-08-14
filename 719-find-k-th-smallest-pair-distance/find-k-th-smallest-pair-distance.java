class Solution {
    public int smallestDistancePair(int[] nums, int k) {
        Arrays.sort(nums);
        int n=nums.length;
        int l=0;
        int r=nums[n-1]-nums[0];

        while(l<r){
            int mid=(l+r)/2;
            int c=solve(mid,nums);
            if(c<k){
                l=mid+1;
            }
            else{ 
                r=mid;
            }
        }
        return l;
    }
    public int solve(int m,int []nums){
        int c=0;
        int n=nums.length;
        int l=0;
        for(int r=0;r<n;r++){
            while(nums[r]-nums[l]>m) l++;
            c+=r-l;
        }
        return c;
    }
}