class Solution {
    public int minimumSubarrayLength(int[] nums, int k) {
        int l=0;
        int r=0;
        int min=Integer.MAX_VALUE;
        int n=nums.length;
        int []bit=new int[32];

        while(r<n){
            update(bit,nums[r],1);
            while(call(bit,k)&& l<=r){
                min= Math.min(min,r-l+1);
                update(bit,nums[l],-1);
                l++;
            }
            r++;
        }
        return min==Integer.MAX_VALUE?-1:min;
    }
    public void update(int[]bit,int num,int d){
        for(int i=0;i<32;i++){
            if(((1<<i)&num)!=0){
                bit[i]+=d;
            }
        }
    }
    public boolean call(int[]bit,int k){
        int a=0;
        for(int i=0;i<32;i++) {
            if(bit[i]>0){
                a+=(1<<i);
            }
        }
        return a>=k;
    }
}