class Solution {
    public int minimizeMax(int[] nums, int p) {
        Arrays.sort(nums);
        int l=0,ans=0;
        int r=nums[nums.length-1]-nums[0];
        System.out.println(Arrays.toString(nums));
        while(l<=r){
            int mid=(l+r)/2;
            if(call(mid,nums,p)){
                ans=mid;
                r=mid-1;
            }
            else
            {
                l=mid+1;
            }
        }
        return ans;
    }
    public boolean call(int mid,int []a,int p){
        int j=0;
        int max=0;
        while(j<a.length-1 && p>0){
            int k=Math.abs(a[j]-a[j+1]);
            if(k<=mid){ p--; j+=1;}
            j+=1;
        }
        return p==0;
    }
}