class Solution {
    public int countPairs(List<Integer> nums, int target) {
        Collections.sort(nums);
        int n=nums.size();
        int cnt=0;
        for(int i=0;i<n;i++){
            cnt+=call(nums.get(i),target,i+1,n-1,nums)-i;
        }
        return cnt;
    }
    public int call(int a,int t,int l,int r,List<Integer>nums){
        int ans=l-1;
        while(l<=r){
            int mid=(l+r)/2;
            if(a+nums.get(mid)<t){
                ans=mid;
                l=mid+1;
            }
            else r=mid-1;
        }
        System.out.println(ans+" "+r);
        return ans;
    }
}