class Solution {
    public int[] sortArray(int[] nums) {
        return call(nums,0,nums.length-1);
    }
    public int[] call(int []nums,int s,int e){
        if(s==e){
            int []a=new int[1];
            a[0]=nums[s];
            return a;
        }
         int mid=(s+e)/2;
         int[]l=call(nums,s,mid);
         int[]r=call(nums,mid+1,e);
         return merge(l,r);
        
    }
    public int[] merge(int []l,int[] r){
        int i=0;
        int j=0;
        int []ans=new int[l.length+r.length];
        int k=0;
        while(i<l.length && j<r.length){
            if(l[i]<=r[j]){
                ans[k++]=l[i++];
            }
            else{
                ans[k++]=r[j++];
            }
        }
        while(i<l.length){
            ans[k++]=l[i++];
        }
        while(j<r.length){
            ans[k++]=r[j++];
        }
        return ans;
    }
}