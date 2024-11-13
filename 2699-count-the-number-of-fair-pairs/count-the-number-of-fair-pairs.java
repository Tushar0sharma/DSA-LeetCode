class Solution {
    public long countFairPairs(int[] nums, int lower, int upper) {
        Arrays.sort(nums);
        System.out.println(Arrays.toString(nums));
        long res=0;
        for(int i=0;i<nums.length;i++){
            res+=call(nums,lower,upper,i);
        }
        return res/2;
    }
    public long call(int []nums,int l,int r,int i){
        int ll=left(nums,l-nums[i]);
        if(ll==-1) return 0;
        int rr=right(nums,r-nums[i]);
        if(rr==-1) return 0;
        int ans=rr-ll+1;
        if(ll<=i && rr>=i) ans--;
        System.out.println(ll+" "+rr+" "+i+" "+ans);
        return ans;
    }
    public int left(int []nums,int tar){
        int i=0;;
        int j=nums.length-1;
        int res=-1;
        while(i<=j){
            int mid=(i+j)/2;
            if(nums[mid]>=tar){
                res=mid;
                j=mid-1;
            }
            else i=mid+1;
        }
        return res;
    }
    public int right(int []nums,int tar){
        int i=0;;
        int j=nums.length-1;
        int res=-1;
        while(i<=j){
            int mid=(i+j)/2;
            if(nums[mid]<=tar){
                res=mid;
                i=mid+1;
            }
            else j=mid-1;
        }
        return res;
    }
}